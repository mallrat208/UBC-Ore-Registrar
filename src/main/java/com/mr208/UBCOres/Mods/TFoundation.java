package com.mr208.UBCOres.Mods;


import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class TFoundation {

    public static void preInit(FMLPreInitializationEvent event)
    {
        Block TFOreBlock = GameRegistry.findBlock("ThermalFoundation","Ore");
        String Ores[] = {"copper","tin","silver","lead","ferrous","shiny","manainfused"};
        int counter = 0;
        for (String Ore : Ores)
        {
            UBCHelper.registerOreBlock(TFOreBlock,counter,Ore, event);
            counter++;
        }
    }
}
