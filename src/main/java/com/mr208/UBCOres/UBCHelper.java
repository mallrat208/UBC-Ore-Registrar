package com.mr208.UBCOres;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import exterminatorJeff.undergroundBiomes.api.UBAPIHook;
import exterminatorJeff.undergroundBiomes.api.UBOreTexturizer;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import sun.rmi.log.LogHandler;

public class UBCHelper {


    public static void registerOreBlock(Block block, int meta,String name,FMLPreInitializationEvent event)
    {
        registerOreBlock( block, meta, "ubcores", name + "_overlay", name, event);
    }

    public static void registerOreBlock(Block block, int meta,String modname, String texturename, String name,FMLPreInitializationEvent event)
    {
        ItemStack placeholder = new ItemStack(  block, 1, meta);
        try {
            UBAPIHook.ubAPIHook.ubOreTexturizer.setupUBOre(block, meta, modname + ":" + texturename, "ore" + name, event);
        } catch (Exception e) {
            if (e instanceof UBOreTexturizer.BlocksAreAlreadySet)
                Log.error(placeholder.getDisplayName() + " is already registered with UBC. Skipping");
            placeholder = null;
        }
        if (placeholder != null)
            Log.info("Added " + placeholder.getDisplayName() + " for Underground Biomes Ore Texturization");
    }
    public static void registerModOresWithMeta(String MODID, String BLOCKNAME, int METASTART, int METASTEP,String[] ORENAMES, FMLPreInitializationEvent event)
    {
            Block ModOreBlock = GameRegistry.findBlock(MODID,BLOCKNAME);
            int counter = METASTART;
            for (String Ore: ORENAMES)
            {
                UBCHelper.registerOreBlock(ModOreBlock,counter,Ore,event);
                counter = counter + METASTEP;
            }
        }
    public static void  registerModOresWithoutMeta(String MODID, String[] BLOCKNAME, String[] NAME, FMLPreInitializationEvent event)
    {
            if (BLOCKNAME.length != NAME.length)
            {
                Log.error("Array Mismatch while setting up " + MODID + " Ores. Skipping.");
                return;
            }
            for (int Ore = 0; Ore<BLOCKNAME.length; Ore++)
            {
                Block ModBlock = GameRegistry.findBlock(MODID,BLOCKNAME[Ore]);
                UBCHelper.registerOreBlock(ModBlock,0,NAME[Ore],event);
            }

        }

}