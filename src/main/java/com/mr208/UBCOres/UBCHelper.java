package com.mr208.UBCOres;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import exterminatorJeff.undergroundBiomes.api.UBAPIHook;
import exterminatorJeff.undergroundBiomes.api.UBOreTexturizer;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class UBCHelper {
    public static void registerOreBlock(Block block, int meta,String name,FMLPreInitializationEvent event) {

        ItemStack placeholder = new ItemStack(block,1,meta);



        try {
            UBAPIHook.ubAPIHook.ubOreTexturizer.setupUBOre(block,
                                                            meta,
                                                            "ubcores:" + name + "_overlay",
                                                            "ore." + name,
                                                            event);
        } catch (Exception e) {
            if (e instanceof UBOreTexturizer.BlocksAreAlreadySet)
                Log.error(placeholder.getDisplayName() + " is already registered with UBC. Skipping");
            placeholder = null;
        }
        if(placeholder!=null) Log.info("Added " + placeholder.getDisplayName() + " for Underground Biomes Ore Texturization");
    }
    public static void registerOreBlockWithModTexture(Block block, int meta,String modname, String texturename, String name,FMLPreInitializationEvent event) {

        ItemStack placeholder = new ItemStack(block,1,meta);
        try {
            UBAPIHook.ubAPIHook.ubOreTexturizer.setupUBOre(block,
                    meta,
                    modname + ":" + texturename,
                    "ore." + name,
                    event);
        } catch (Exception e) {
            if (e instanceof UBOreTexturizer.BlocksAreAlreadySet)
                Log.error(placeholder.getDisplayName() + " is already registered with UBC. Skipping");
            placeholder = null;
        }
        if(placeholder!=null) Log.info("Added " + placeholder.getDisplayName() + " for Underground Biomes Ore Texturization");
    }
}