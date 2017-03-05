package com.mr208.UBCOres;


import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class Config {

    public static Configuration config;

    public static boolean TFOres;
    public static boolean AE2Ores;
    
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
        TFOres = config.getBoolean("Thermal Foundation Support", "Mod Support", true, "Enable UBified versions of Thermal Foundation Ores (Copper, Ferrous, Lead, Mana Infused, Shiny, Silver, Tin).");
        AE2Ores = config.getBoolean("Applied Energistics 2 Support", "Mod Support", true, "Enable UBified versions of AE2 Ores (Certus Quartz, Charged Certus Quartz).  Charged Quartz will not have a particle effect.");

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
