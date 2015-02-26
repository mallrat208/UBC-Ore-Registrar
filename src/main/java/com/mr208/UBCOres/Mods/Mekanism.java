package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class Mekanism
{


    public static void preInit(FMLPreInitializationEvent event)
    {
        Block MekOreBlock = GameRegistry.findBlock("Mekanism","OreBlock");
        short counter = 0;
        String Ores[] = {"osmium","copper","tin"};
        for(String Ore : Ores)
        {
            UBCHelper.registerOreBlock(MekOreBlock,counter, Ore,event);
            counter++;
        }
    }
}
