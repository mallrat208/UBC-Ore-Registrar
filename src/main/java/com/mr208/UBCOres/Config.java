package com.mr208.UBCOres;


import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class Config {

    public static Configuration config;

    public static boolean TFOres;
    public static boolean AE2Ores;
    public static boolean ForestryOres;
    public static boolean IEOres;
    public static boolean DROres;
    public static boolean BOPOres;
    public static boolean BROres;
    public static boolean EmbersOres;
    public static boolean AM2Ores;
    public static boolean MagniOres;
    public static boolean DEOres;
    public static boolean MAOres;
    public static boolean RailOres;
    public static boolean RailPoorOres;
    public static boolean MekaOres;
    public static boolean SGCores;
    public static boolean RFTOres;
    public static boolean AROres;
    
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
        TFOres = config.getBoolean("Thermal Foundation", "Mod Support", true, "Enable UBified versions of Thermal Foundation Ores. (Copper, Ferrous, Lead, Mana Infused, Shiny, Silver, Tin)");
        AE2Ores = config.getBoolean("Applied Energistics 2", "Mod Support", true, "Enable UBified versions of AE2 Ores. (Certus Quartz, Charged Certus Quartz) Note: Charged Quartz will not have a particle effect.");
        DROres = config.getBoolean("Deep Resonance","Mod Support", true, "Enable UBified versions of Deep Resonance Ores. (Resonating)");
        BROres = config.getBoolean("Big/Extreme Reactors","Mod Support", true, "Enable UBified versions of Big/Extreme Reactors Ores. (Yellorite)");
        BOPOres = config.getBoolean("Biomes O' Plenty","Mod Support", true, "Enable UBified versions of Biomes O' Plenty Ores. (Ruby, Peridot, Topaz, Tanzanite, Malachite, Amber, and Biome Essence)");
        IEOres = config.getBoolean("Immersive Engineering", "Mod Support", true,"Enable UBified versions of Immersive Engineering Ores. (Copper, Bauxite, Lead, Silver, Nickel, and Uranium)");
        ForestryOres = config.getBoolean("Forestry","Mod Support", true, "Enabled UBified versions of Forestry Ores. (Copper, Tin, and Apatite)");
        EmbersOres = config.getBoolean("Embers", "Mod Support", true, "Enable UBified versions of Embers Ores. (Copper, Lead, Silver");
        AM2Ores = config.getBoolean("Ars Magica 2", "Mod Support", true, "Enable UBified versions of Ars Magica 2 Ores. (Vinteum, Chimerite, Blue Topaze, and Moonstone)");
        MagniOres = config.getBoolean("Magneticraft","Mod Support", true, "Enable UBified versions of Magneticraft Ores. (Copper, Lead, Cobalt, Tungsten)");
        DEOres = config.getBoolean("Draconic Evolution", "Mod Support", true, "Enable UBified versions of Draconic Evolution Ores. (Draconium Ore)");
        MAOres = config.getBoolean("Mystical Agriculture", "Mod Support", true, "Enable UBified versions of Mystical Agriculture Ores. (Prosperity and Inferium)");
        RailOres = config.getBoolean("Railcraft", "Mod Support", true, "Enables UBified versions of Railcraft Ores. (Copper, Tin, Lead, Silver)");
        RailPoorOres = config.getBoolean("Railcraft - Poor Ores", "Mod Support", true, "Enables UBified versions of Railcraft Poor Ores. (Poor Iron, Poor Gold, Poor Copper, Poor Tin, Poor Lead, and Poor Silver");
        MekaOres = config.getBoolean("Mekanism", "Mod Support", true, "Enables UBified versions of Mekanism Ores. (Copper, Tin, Osmium)");
        SGCores = config.getBoolean("SGCraft","Mod Support", true, "Enables UBified versions of SGCraft Ores. (Naquadah)");
        RFTOres = config.getBoolean("RFTools", "Mod Support", true, "Enables UBified versions of RFTools Ores. (Dimensional Shards)");
        AROres = config.getBoolean("Advanced Rocketry", "Mod Support", true, "Enables UBified versions of Adv. Rocketry Ores. (Dilithium, Copper, Tin, Titanium, Aluminum, Iridium");


        if (config.hasChanged())
        {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event)
    {
        if(event.getModID().equalsIgnoreCase(References.MODID))
        {
            loadConfig();
        }
    }

}
