package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class AE2 {

    public static void preInit(FMLPreInitializationEvent event)
    {
        Block AEcertusOre = GameRegistry.findBlock("appliedenergistics2","tile.OreQuartz");
        Block AEcertusChargedOre = GameRegistry.findBlock("appliedenergistics2","tile.OreQuartzCharged");
        UBCHelper.registerOreBlock(AEcertusOre,0,"certus",event);
        UBCHelper.registerOreBlock(AEcertusChargedOre,0,"certusCharged",event);
    }

}
