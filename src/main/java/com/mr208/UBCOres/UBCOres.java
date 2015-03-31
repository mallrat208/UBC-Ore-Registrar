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


        if(Config.FZOres && Loader.isModLoaded("factorization")) Mods.Factorization(event);
        if(Config.ThaumOres && Loader.isModLoaded("Thaumcraft")) Mods.Thaumcraft(event);
        if(Config.Steam2Ores && Loader.isModLoaded("steamcraft2")) Mods.Steamcraft2(event);
        if(Config.TFOres && Loader.isModLoaded("ThermalFoundation")) Mods.ThermalFoundation(event);
        if(Config.HarvestOres && Loader.isModLoaded("harvestcraft")) Mods.Harvestcraft(event);
        if(Config.RailOres && Loader.isModLoaded("Railcraft")) Mods.Railcraft(event);
        if(Config.FSPOres && Loader.isModLoaded("Steamcraft")) Mods.FlaxSteampower(event);
        if(Config.BROre && Loader.isModLoaded("BigReactors")) Mods.BigReactors(event);
        if(Config.FarOres && Loader.isModLoaded("farlanders")) Mods.Farlanders(event);
        if(Config.MekOres && Loader.isModLoaded("Mekanism")) Mods.Mekanism(event);
        if(Config.IC2Ores && Loader.isModLoaded("IC2")) Mods.IC2(event);
        if(Config.AE2Ores && Loader.isModLoaded("appliedenergistics2")) Mods.AE2(event);
		if(Config.ForOres && Loader.isModLoaded("Forestry")) Mods.Forestry(event);
		if(Config.TinkOres && Loader.isModLoaded("TConstruct")) Mods.TConstruct(event);

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        if(Loader.isModLoaded("magicalcrops") & Config.magCropOre) Mods.MagicalCrops(null);
        if(Loader.isModLoaded("ProjRed|Exploration") & Config.ProjRedOres) Mods.ProjectRed(null);
    }
}
