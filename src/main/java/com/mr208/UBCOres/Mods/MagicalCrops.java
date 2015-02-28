package com.mr208.UBCOres.Mods;

import com.mr208.UBCOres.UBCHelper;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class MagicalCrops {

    public static void Init()
    {
        Block magCropOre = GameRegistry.findBlock("magicalcrops","magicalcrops_EssenceOre");
        //So, as it turns out you can pass a null object for the event. Seeing as it isn't used... This works for now and is simple
        UBCHelper.registerOreBlockWithModTexture(magCropOre,0,"magicalcrops","EssenceOre_layer","mcEssenceOre",null);
    }
}
