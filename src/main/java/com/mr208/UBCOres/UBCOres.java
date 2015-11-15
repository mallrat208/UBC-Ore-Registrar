package com.mr208.UBCOres;

import net.minecraftforge.event.world.ChunkDataEvent;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.MODNAME, dependencies = References.DEPENDENCIES, version = References.VERSION)
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
        if(Config.BOPOre && Loader.isModLoaded("BiomesOPlenty")) Mods.BOP(event);
        if(Config.TFOres && Loader.isModLoaded("ThermalFoundation")) Mods.ThermalFoundation(event);
        if(Config.HarvestOres && Loader.isModLoaded("harvestcraft")) Mods.Harvestcraft(event);
        if(Config.RailOres && Loader.isModLoaded("Railcraft")) Mods.Railcraft(event);
        if(Config.FSPOres && Loader.isModLoaded("Steamcraft")) Mods.FlaxSteampower(event);
        if(Config.BROre && Loader.isModLoaded("BigReactors")) Mods.BigReactors(event);
        if(Config.FarOres && Loader.isModLoaded("farlanders")) Mods.Farlanders(event);
        if(Config.MekOres && Loader.isModLoaded("Mekanism")) Mods.Mekanism(event);
        if(Config.IC2Ores && Loader.isModLoaded("IC2")) Mods.IC2(event);
        if(Config.IC2Ores && Loader.isModLoaded("IC2-Classic-Spmod")) Mods.IC2Classic(event);
        if(Config.AE2Ores && Loader.isModLoaded("appliedenergistics2")) Mods.AE2(event);
        if(Config.ForOres && Loader.isModLoaded("Forestry")) Mods.Forestry(event);
        if(Config.IEOres && Loader.isModLoaded("ImmersiveEngineering")) Mods.ImmEng(event);
        //if(Config.TinkOres && Loader.isModLoaded("TConstruct")) Mods.TConstruct(event);
        if(Config.GalacticOres && Loader.isModLoaded("GalacticraftCore")) Mods.GalactiCraft(event);
        if(Config.JaffaOres && Loader.isModLoaded("Jaffas-Technic")) Mods.JaffasAndMore(event);
        if(Config.TaintOres && Loader.isModLoaded("TaintedMagic")) Mods.TaintedMagic(event);
        if(Config.ClockPhaseOres && Loader.isModLoaded("clockworkphase")) Mods.ClockworkPhase(event);
        if(Config.RFToolsOres && Loader.isModLoaded("rftools")) Mods.RFTools(event);
        if(Config.ElnOres && Loader.isModLoaded("Eln")) Mods.ElectricalAge(event);
        if(Config.DEOre && Loader.isModLoaded("DraconicEvolution")) Mods.DraconicEvolution(event);
        if(Config.DeepResonanceOres && Loader.isModLoaded("deepresonance")) Mods.DeepResonance(event);
        if(Config.QuantumFluxOres && Loader.isModLoaded("quantumflux")) Mods.QuantumFlux(event);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        if(Config.magCropOre && Loader.isModLoaded("magicalcrops")) Mods.MagicalCrops(null);
        if(Config.ProjRedOres && Loader.isModLoaded("ProjRed|Exploration")) Mods.ProjectRed(null);
        if(Config.BPOres && Loader.isModLoaded("bluepower")) Mods.BluePower(null);
        if(Config.AM2Ores && Loader.isModLoaded("arsmagica2")) Mods.ArsMag(null);
        if(Config.FossilOres && Loader.isModLoaded("fossil")) Mods.FossilsAndArcheology(null);
    }
}
