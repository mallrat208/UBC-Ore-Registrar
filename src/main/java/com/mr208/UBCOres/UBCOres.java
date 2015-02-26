package com.mr208.UBCOres;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.mr208.UBCOres.Mods.*;

@Mod(modid=References.MODID, name=References.MODNAME, dependencies = References.DEPENDENCIES, version = References.VERSION)
public class UBCOres {

@Mod.Instance(References.MODID)
public static UBCOres instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        Config.init(event.getSuggestedConfigurationFile());


        if(Loader.isModLoaded("factorization") & Config.FZOres) Factorization.preInit(event);
        if(Loader.isModLoaded("Thaumcraft") & Config.ThaumOres) Thaumcraft.preInit(event);
        if(Loader.isModLoaded("steamcraft2") & Config.Steam2Ores) Steamcraft2.preInit(event);
        if(Loader.isModLoaded("BiomesOPlenty") & Config.BOPOre) BiomesOPlenty.preInit(event);
        if(Loader.isModLoaded("ThermalFoundation") & Config.TFOres) TFoundation.preInit(event);
        if(Loader.isModLoaded("harvestcraft") & Config.HarvestOres) Harvestcraft.preInit(event);
        if(Loader.isModLoaded("Railcraft") & Config.RailOres) Railcraft.preInit(event);
        if(Loader.isModLoaded("Steamcraft")& Config.FSPOres) FSP.preInit(event);
        if(Loader.isModLoaded("BigReactors") & Config.BROre) BigReactors.preInit(event);
        if(Loader.isModLoaded("farlanders") & Config.FarOres) Farlanders.preInit(event);
        if(Loader.isModLoaded("Mekanism") & Config.MekOres) Mekanism.preInit(event);
        if(Loader.isModLoaded("IC2") & Config.IC2Ores) IndustrialCraft.preInit(event);
        if(Loader.isModLoaded("appliedenergistics2") & Config.AE2Ores) AE2.preInit(event);

    }
}
