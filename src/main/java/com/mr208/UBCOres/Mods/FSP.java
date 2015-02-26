package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class FSP {

    public static void preInit(FMLPreInitializationEvent event)
    {
        Block FSPOreBlock = GameRegistry.findBlock("Steamcraft","steamcraftOre");

        UBCHelper.registerOreBlock(FSPOreBlock, 0, "copper", event);
        UBCHelper.registerOreBlock(FSPOreBlock, 1, "zinc", event);
    }
}
