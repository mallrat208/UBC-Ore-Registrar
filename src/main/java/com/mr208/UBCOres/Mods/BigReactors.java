package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class BigReactors
{
    public static void preInit(FMLPreInitializationEvent event)
    {
        Block BROreBlock = GameRegistry.findBlock("BigReactors","YelloriteOre");

        UBCHelper.registerOreBlock(BROreBlock,0,"yellorite",event);
    }
}
