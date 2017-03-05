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
        ForestryOres = config.getBoolean("Forestry","Mod Support", true, "Enabled UBified versions of Forestry Ores. (Copper, Tin, and Apatite)");
        IEOres = config.getBoolean("Immersive Engineering", "Mod Support", true,"Enable UBified versions of Immersive Engineering Ores. (Copper, Bauxite, Lead, Silver, Nickel, and Uranium)");
        DROres = config.getBoolean("Deep Resonance","Mod Support", true, "Enable UBified versions of Deep Resonance Ores. (Resonating)");
        BROres = config.getBoolean("Big/Extreme Reactors","Mod Support", true, "Enable UBified versions of Big/Extreme Reactors Ores. (Yellorite)");
        BOPOres = config.getBoolean("Biomes O' Plenty","Mod Support", true, "Enable UBified versions of Biomes O' Plenty Ores. (Ruby, Peridot, Topaz, Tanzanite, Malachite, Amber, and Biome Essence)");

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
