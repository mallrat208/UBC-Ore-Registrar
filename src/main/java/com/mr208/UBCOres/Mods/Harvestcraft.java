package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;


public class Harvestcraft {

    public static void preInit(FMLPreInitializationEvent event)
    {
        Block HCOreBlock = GameRegistry.findBlock("harvestcraft","salt");

        UBCHelper.registerOreBlock(HCOreBlock,0,"salt",event);
    }
}
