package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class Railcraft
{
    public static void preInit(FMLPreInitializationEvent event)
    {
        Block RCOreBlock = GameRegistry.findBlock("Railcraft","tile.railcraft.ore");

        UBCHelper.registerOreBlock(RCOreBlock,0,"sulfur",event);
    }
}
