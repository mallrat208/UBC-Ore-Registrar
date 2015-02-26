package com.mr208.UBCOres;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import com.mr208.UBCOres.References;
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

    public static void init(File configFile)
    {
        if (config==null)
        {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    public static void loadConfig()
    {
        BROre = config.getBoolean("1) Enable Big Reactors Support","Mod Support",true,"Enable this to have Yellorite spawn with UB Textures");
        BOPOre = config.getBoolean("2) Enable Biomes O Plenty Gems","Mod Support",true,"Enable this to have Ruby, Sapphire, Peridot, Malachite, Tanzanite, Topaz, and Amber from Biomes O Plenty spawn with UB Textures.");
        FZOres = config.getBoolean("3) Enable Factorization Support", "Mod Support",true,"Enable this to have Dark Iron and Silver spawn with UB Textures.");
        FarOres = config.getBoolean("4) Enable Farlanders Support", "Mod Support",true,"Enable this to have Endumium spawn with UB Textures");
        FSPOres = config.getBoolean("6) Enable Flaxbeard's Steampower Support", "Mod Support", true,"Enable this to have Copper and Zinc spawn with UB textures.");
        HarvestOres = config.getBoolean("7) Enable Pam's Harvestcraft Support", "Mod Support", true,"Enable this to have Salt spawn with UB Textures.");
        IC2Ores = config.getBoolean("8) Enable IndustrialCraft 2 Support","Mod Support", true,"Enable this to have Copper, Lead, Tin, and Uranium spawn with UB Textures.");
        MekOres = config.getBoolean("9) Enable Mekanism Support","Mod Support", true,"Enable this to have Osmium, Copper, and Tin spawn with UB Textures.");
        RailOres = config.getBoolean("10) Enable Railcraft Support", "Mod Support", true, "Enable this to have Sulfur spawn with UB Textures.");
        Steam2Ores = config.getBoolean("11) Enable Steamcraft 2 Support", "Mod Support", true, "Enable this to have Copper, Tin, Zinc, Aluminum, Brimstone, Phosphate, and Uranite to spawn with UB Textures");
        TFOres = config.getBoolean("12) Enable Thermal Foundation Support", "Mod Support", true, "Enable this to hsve Copper, Tin, Silver, Lead, Ferrous, Shiny, and Mana Infused Ore spawn with UB Textures. ");
        ThaumOres = config.getBoolean("13) Enable Thaumcraft Support", "Mod Support", true, "Enable this to have Cinnibar, Amber, and Infused Stone spawn with UB Textures.");
        AE2Ores = config.getBoolean("14) Enable Applied Energistics 2 Support", "Mod Support", true, "Enable this to have Certus Quartz and Charged Certus Quartz spawn with UB Textures. Note, Charged Quartz will not have a particle effect");

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
