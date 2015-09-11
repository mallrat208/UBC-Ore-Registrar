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
        BROre = config.getBoolean("Big Reactors Support","Mod Support",true,"Enable this to have Yellorite spawn with UB Textures");
        BOPOre = config.getBoolean("Biomes O Plenty Gems","Mod Support",true,"Enable this to have Ruby, Sapphire, Peridot, Malachite, Tanzanite, Topaz, and Amber from Biomes O Plenty spawn with UB Textures.");
        FZOres = config.getBoolean("Factorization Support", "Mod Support",true,"Enable this to have Dark Iron and Silver spawn with UB Textures.");
        FarOres = config.getBoolean("Farlanders Support", "Mod Support",true,"Enable this to have Endumium spawn with UB Textures");
        FSPOres = config.getBoolean("Flaxbeard's Steampower Support", "Mod Support", true,"Enable this to have Copper and Zinc spawn with UB textures.");
        HarvestOres = config.getBoolean("Pam's Harvestcraft Support", "Mod Support", true,"Enable this to have Salt spawn with UB Textures.");
        IC2Ores = config.getBoolean("IndustrialCraft 2 Support","Mod Support", true,"Enable this to have Copper, Lead, Tin, and Uranium spawn with UB Textures.");
        MekOres = config.getBoolean("Mekanism Support","Mod Support", true,"Enable this to have Osmium, Copper, and Tin spawn with UB Textures.");
        RailOres = config.getBoolean("Railcraft Support", "Mod Support", true, "Enable this to have Sulfur spawn with UB Textures.");
        Steam2Ores = config.getBoolean("Steamcraft 2 Support", "Mod Support", true, "Enable this to have Copper, Tin, Zinc, Aluminum, Brimstone, Phosphate, and Uranite to spawn with UB Textures");
        TFOres = config.getBoolean("Thermal Foundation Support", "Mod Support", true, "Enable this to hsve Copper, Tin, Silver, Lead, Ferrous, Shiny, and Mana Infused Ore spawn with UB Textures. ");
        ThaumOres = config.getBoolean("Thaumcraft Support", "Mod Support", true, "Enable this to have Cinnibar, Amber, and Infused Stone spawn with UB Textures.");
        AE2Ores = config.getBoolean("Applied Energistics 2 Support", "Mod Support", true, "Enable this to have Certus Quartz and Charged Certus Quartz spawn with UB Textures. Note, Charged Quartz will not have a particle effect");
        magCropOre = config.getBoolean("Magical Crops Support", "Mod Support", true, "Enable to have Essence Ore spawn with UB Textures. Ore will not have particle effects");
        ProjRedOres = config.getBoolean("Project Red Support", "Mod Support", true, "Enable this to have Ruby, Sapphire, and Peridot spawn with UB Textures.");
		ForOres = config.getBoolean("Forestry Support","Mod Support", true, "Enable this to have Apatite, Copper and Tin spawn with UB Textures.");
		//TinkOres = config.getBoolean("Tinkers Construct Support","Mod Support", true, "Enable this to have Copper, Tin, and Aluminum spawn with UB Textures. Does not affect Ore Gravel.");
		BPOres = config.getBoolean("Blue Power Support","Mod Support", true, "Enable this to have Teslatite, Copper, Silver, Zinc, Tungsten, Ruby, Sapphire, and Amethyst spawn with UB Textures");
		IEOres = config.getBoolean("Immersive Engineering Support", "Mod Support", true,"Enable this to have Copper, Bauxite, Lead, Silver, and Nickel spawn with UB Textures");
		AM2Ores = config.getBoolean("Ars Magica 2 Support","Mod Support", true,"Enable this to have Vinteum, Chimerite, Blue Topaz, and Moonstone spawn with UB Textures");
    GalacticOres = config.getBoolean("GalactiCraft Support","Mod Support",true,"Enable this to have GalactiCraft's Aluminium, Copper, Silicon, and Tin generate with UB textures.");
    JaffaOres = config.getBoolean("Jaffas and More Support","Mod Support",true,"Enable this to have Jaffas and More's Limsew and Jaffarrol generate with UB textures.");
    TaintOres = config.getBoolean("Tainted Magic Support","Mod Support",true,"Enable this to have Tainted Magic's Shadow generate with UB textures.");
    ClockPhaseOres = config.getBoolean("Clockwork Phase Support","Mod Support",true,"Enable this to have Clockwork Phase's Temporal generate with UB textures.");
    
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
