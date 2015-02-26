package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class BiomesOPlenty {

    public static void preInit(FMLPreInitializationEvent event)
    {
        Block BOPgemOre = GameRegistry.findBlock("BiomesOPlenty","gemOre");
        String Ores[] = {"ruby","peridot","topaz", "tanzanite", "malachite", "sapphire", "amber"};
        int counter = 2;

        for(String Ore : Ores)
        {
            UBCHelper.registerOreBlock(BOPgemOre,counter,Ore,event);
            counter = counter + 2;
        }
    }
}

