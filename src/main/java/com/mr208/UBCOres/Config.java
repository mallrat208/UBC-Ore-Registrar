package com.mr208.UBCOres;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class Config {

    public static Configuration config;

    public static boolean BROre;
    public static boolean BOPOre;
    public static boolean FZOres;
    public static boolean FarOres;
    public static boolean FSPOres;
    public static boolean HarvestOres;
    public static boolean IC2Ores;
    public static boolean MekOres;
    public static boolean RailOres;
    public static boolean Steam2Ores;
    public static boolean TFOres;
    public static boolean ThaumOres;
    public static boolean AE2Ores;
    public static boolean magCropOre;
    public static boolean ProjRedOres;
    public static boolean ForOres;
    public static boolean IEOres;
    //public static boolean TinkOres;
    public static boolean BPOres;
    public static boolean AM2Ores;
    public static boolean GalacticOres;
    public static boolean JaffaOres;
    public static boolean TaintOres;
    public static boolean ClockPhaseOres;
    public static boolean RFToolsOres;
    public static boolean ElnOres;
    public static boolean FossilOres;
    public static boolean DEOre;
    public static boolean DeepResonanceOres;
    public static boolean QuantumFluxOres;
    public static boolean ReactorCraftOres;

    public static void init(File configFile)
    {
        if(config == null)
        {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    public static void loadConfig()
    {
        BROre = config.getBoolean("Big Reactors Support", "Mod Support", true, "Enable UBified versions of Big Reactors' Yellorite Ore.");
        BOPOre = config.getBoolean("Biomes O Plenty Gems", "Mod Support", true, "Enable UBified versions of Biomes O' Plenty Gem Ores (Amber, Malachite, Peridot, Ruby, Sapphire, Tanzanite, Topaz).");
        FZOres = config.getBoolean("Factorization Support", "Mod Support", true, "Enable UBified versions of Factorization Ores (Dark Iron, Silver).");
        FarOres = config.getBoolean("Farlanders Support", "Mod Support", true, "Enable UBified versions of Farlanders' Endumium Ore.");
        FSPOres = config.getBoolean("Flaxbeard's Steampower Support", "Mod Support", true, "Enable UBified versions of Steampower Ores (Copper, Zinc).");
        HarvestOres = config.getBoolean("Pam's Harvestcraft Support", "Mod Support", true, "Enable UBified versions of Harvestcraft's Salt Ore.");
        IC2Ores = config.getBoolean("IndustrialCraft 2 Support", "Mod Support", true, "Enable UBified versions of IC2 Ores (Copper, Lead, Tin, Uranium).");
        MekOres = config.getBoolean("Mekanism Support", "Mod Support", true, "Enable UBified versions of Mekanism Ores (Copper, Osmium, Tin).");
        RailOres = config.getBoolean("Railcraft Support", "Mod Support", true, "Enable UBified versions of Railcraft's Sulfur Ore.  UBified Poor Ores currently not supported.");
        Steam2Ores = config.getBoolean("Steamcraft 2 Support", "Mod Support", true, "Enable UBified versions of Steamcraft 2 Ores (Aluminum, Brimstone, Copper, Phosphate, Tin, Uranite, Zinc).");
        TFOres = config.getBoolean("Thermal Foundation Support", "Mod Support", true, "Enable UBified versions of Thermal Foundation Ores (Copper, Ferrous, Lead, Mana Infused, Shiny, Silver, Tin).");
        ThaumOres = config.getBoolean("Thaumcraft Support", "Mod Support", true, "Enable UBified versions of Thaumcraft Ores (Amber, Cinnibar, Infused Stone).");
        AE2Ores = config.getBoolean("Applied Energistics 2 Support", "Mod Support", true, "Enable UBified versions of AE2 Ores (Certus Quartz, Charged Certus Quartz).  Charged Quartz will not have a particle effect.");
        magCropOre = config.getBoolean("Magical Crops Support", "Mod Support", true, "Enable UBified versions of Magical Crops' Essence Ore.  Will not have particle effects.");
        ProjRedOres = config.getBoolean("Project Red Support", "Mod Support", true, "Enable UBified versions of Project Red Ores (Peridot, Ruby, Sapphire).");
        ForOres = config.getBoolean("Forestry Support", "Mod Support", true, "Enable UBified versions of Forestry Ores (Apatite, Copper, Tin).");
        //TinkOres = config.getBoolean("Tinkers Construct Support", "Mod Support", true, "Enable UBified versions of TC Ores (Aluminum, Copper, Tin).  Does not affect Gravel Ores.");
        BPOres = config.getBoolean("Blue Power Support", "Mod Support", true, "Enable UBified versions of Blue Power Ores (Amethyst, Copper, Ruby, Sapphire, Silver, Teslatite, Tungsten, Zinc).");
        IEOres = config.getBoolean("Immersive Engineering Support", "Mod Support", true, "Enable UBified versions of Immersive Engineering Ores (Bauxite, Copper, Lead, Nickel, Silver).");
        AM2Ores = config.getBoolean("Ars Magica 2 Support", "Mod Support", true, "Enable UBified versions of Ars Magica 2 Ores (Blue Topaz, Chimerite, Moonstone, Vinteum).");
        GalacticOres = config.getBoolean("GalactiCraft Support", "Mod Support", true, "Enable UBified versions of GalactiCraft Ores (Aluminium, Copper, Silicon, Tin).");
        JaffaOres = config.getBoolean("Jaffas and More Support", "Mod Support", true, "Enable UBified versions of Jaffas and More Ores (Jaffarrol, Limsew).");
        TaintOres = config.getBoolean("Tainted Magic Support", "Mod Support", true, "Enable UBified versions of Tainted Magic's Shadow Ore.");
        ClockPhaseOres = config.getBoolean("Clockwork Phase Support", "Mod Support", true, "Enable UBified versions of Clockwork Phase's Temporal Ore.");
        RFToolsOres = config.getBoolean("RFTools Support", "Mod Support", true, "Enable UBified versions of RFTools' Dimensional Shards Ore.");
        ElnOres = config.getBoolean("Electrical Age Support", "Mod Support", true, "Enable UBified versions of Electrical Age's Ores (Cinnabar, Copper, Lead, Tungsten).");
        FossilOres = config.getBoolean("Fossils and Archeology Revival Support", "Mod Support", true, "Enable UBified versions of Fossils and Archeology Revival Ores (Amber, Fossils).");
        DEOre = config.getBoolean("Draconic Evolution Support", "Mod Support", true, "Enable UBified versions of Draconic Evolution's Draconium Ore.");
        DeepResonanceOres = config.getBoolean("Deep Resonance Support", "Mod Support", true, "Enable UBified version of Resonating Ore from Deep Resonance");
        QuantumFluxOres = config.getBoolean("Quantum Flux Support", "Mod Support", true, "Enable UBified version of Titanium Ore from Quantum Flux");
        ReactorCraftOres = config.getBoolean("ReactorCraft Support", "Mod Support", true, "Enable UBified versions of ReactorCraft Ores");

    
        if (config.hasChanged())
        {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(References.MODID))
        {
            loadConfig();
        }
    }

}
