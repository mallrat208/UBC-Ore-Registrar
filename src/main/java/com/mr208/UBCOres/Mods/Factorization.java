package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class Factorization {

    public static void preInit(FMLPreInitializationEvent event)
    {

        Block FZDarkIron = GameRegistry.findBlock("factorization","DarkIronOre");
        Block FZGalena = GameRegistry.findBlock("factorization","ResourceBlock");

        UBCHelper.registerOreBlock(FZDarkIron,0,"darkiron",event);
        UBCHelper.registerOreBlock(FZGalena,0,"silver",event);


    }
}
