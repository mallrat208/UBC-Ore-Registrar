package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class Farlanders
{
    public static void preInit(FMLPreInitializationEvent event)
    {
        Block FLOreBlock = GameRegistry.findBlock("farlanders","Endumium Ore");

        UBCHelper.registerOreBlock(FLOreBlock, 0, "endumium", event);
    }
}
