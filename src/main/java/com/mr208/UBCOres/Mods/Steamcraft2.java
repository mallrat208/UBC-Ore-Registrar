package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class Steamcraft2 {

    public static Block SC2OreBlock;
    public static String[] Ores = {"aluminum","copper","tin", "zinc","uranite","brimstone","phosphate"};

    public static void preInit(FMLPreInitializationEvent event)
    {

        SC2OreBlock = GameRegistry.findBlock("steamcraft2","BlockSteamcraftOre");
        short counter = 0;
        for (String Ore : Ores )
         {
            UBCHelper.registerOreBlock(SC2OreBlock,counter,Ore, event);
            counter++;
         }
    }
}
