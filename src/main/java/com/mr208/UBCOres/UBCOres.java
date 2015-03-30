package com.mr208.UBCOres;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=References.MODID, name=References.MODNAME, dependencies = References.DEPENDENCIES, version = References.VERSION)
public class UBCOres {

@Mod.Instance(References.MODID)
public static UBCOres instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        Config.init(event.getSuggestedConfigurationFile());


        if(Loader.isModLoaded("factorization") & Config.FZOres) Mods.Factorization(event);
        if(Loader.isModLoaded("Thaumcraft") & Config.ThaumOres) Mods.Thaumcraft(event);
        if(Loader.isModLoaded("steamcraft2") & Config.Steam2Ores) Mods.Steamcraft2(event);
        if(Loader.isModLoaded("BiomesOPlenty") & Config.BOPOre) Mods.BOP(event);
        if(Loader.isModLoaded("ThermalFoundation") & Config.TFOres) Mods.ThermalFoundation(event);
        if(Loader.isModLoaded("harvestcraft") & Config.HarvestOres) Mods.Harvestcraft(event);
        if(Loader.isModLoaded("Railcraft") & Config.RailOres) Mods.Railcraft(event);
        if(Loader.isModLoaded("Steamcraft")& Config.FSPOres) Mods.FlaxSteampower(event);
        if(Loader.isModLoaded("BigReactors") & Config.BROre) Mods.BigReactors(event);
        if(Loader.isModLoaded("farlanders") & Config.FarOres) Mods.Farlanders(event);
        if(Loader.isModLoaded("Mekanism") & Config.MekOres) Mods.Mekanism(event);
        if(Loader.isModLoaded("IC2") & Config.IC2Ores) Mods.IC2(event);
        if(Loader.isModLoaded("appliedenergistics2") & Config.AE2Ores) Mods.AE2(event);
		if(Loader.isModLoaded("Forestry") & Config.ForOres) Mods.Forestry(event);

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        if(Loader.isModLoaded("magicalcrops") & Config.magCropOre) Mods.MagicalCrops(null);
        if(Loader.isModLoaded("ProjRed|Exploration") & Config.ProjRedOres) Mods.ProjectRed(null);
    }
}
