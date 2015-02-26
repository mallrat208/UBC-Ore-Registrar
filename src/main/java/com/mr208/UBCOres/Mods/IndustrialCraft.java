package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class IndustrialCraft {

    public static void preInit(FMLPreInitializationEvent event)
    {
        Block IC2Copper = GameRegistry.findBlock("IC2","blockOreCopper");
        Block IC2Tin = GameRegistry.findBlock("IC2","blockOreTin");
        Block IC2Lead = GameRegistry.findBlock("IC2","blockOreLead");
        Block IC2Uranium = GameRegistry.findBlock("IC2","blockOreUran");

        UBCHelper.registerOreBlock(IC2Copper,0,"copper",event);
        UBCHelper.registerOreBlock(IC2Lead,0,"lead",event);
        UBCHelper.registerOreBlock(IC2Tin,0,"tin",event);
        UBCHelper.registerOreBlock(IC2Uranium,0,"uranium",event);
    }
}
