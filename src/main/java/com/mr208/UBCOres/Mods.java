package com.mr208.UBCOres;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class Mods {

	public static void AE2(FMLPreInitializationEvent event)
	{
		String[] BLOCKS = {"tile.OreQuartz","tile.OreQuartzCharged"};
		String[] NAMES = {"certus","certusCharged"};
		UBCHelper.registerModOresWithoutMeta("appliedenergistics2",BLOCKS,NAMES, event);
	}

	public static void BigReactors(FMLPreInitializationEvent event)
	{
		Block BLOCK = GameRegistry.findBlock("BigReactors","YelloriteOre");
		UBCHelper.registerOreBlock(BLOCK, 0, "yellorite", event);
	}

	public static void BOP(FMLPreInitializationEvent event)
	{
		String NAMES[] = {"ruby","peridot","topaz", "tanzanite", "malachite", "sapphire", "amber"};
		UBCHelper.registerModOresWithMeta("BiomesOPlenty", "gemOre", 2, 2, NAMES, event);
	}
  
  //NOTE: Temporal ore doesn't spawn naturally
  public static void ClockworkPhase(FMLPreInitializationEvent event)
  {
    Block temporalOre = GameRegistry.findBlock("clockworkphase", "oreTemporal");
    UBCHelper.registerOreBlock(temporalOre, 0, "temporal", event);
  }
  
  public static void ElectricalAge(FMLPreInitializationEvent event)
  {
    Block elnOreBlock = GameRegistry.findBlock("Eln", "Eln.Ore");
    UBCHelper.registerOreBlock(elnOreBlock, 1, "elnCopper", event);
    String[] NAMES = {"elnLead", "elnTungsten", "elnCinnabar"};
    for (int it = 0; it < NAMES.length; it++) {
      UBCHelper.registerOreBlock(elnOreBlock, it + 4, NAMES[it], event);
    }
  }

	public static void Factorization(FMLPreInitializationEvent event)
	{
		String[] BLOCKS = {"DarkIronOre","ResourceBlock"};
		String[] NAMES = {"darkiron","silver"};
		UBCHelper.registerModOresWithoutMeta("factorization", BLOCKS, NAMES, event);
	}

	public static void Farlanders(FMLPreInitializationEvent event)
	{
		Block FLOreBlock = GameRegistry.findBlock("farlanders","Endumium Ore");
		UBCHelper.registerOreBlock(FLOreBlock, 0, "endumium", event);
	}

	public static void FlaxSteampower(FMLPreInitializationEvent event)
	{
		String Ores[] = {"copper","zinc"};
		UBCHelper.registerModOresWithMeta("Steamcraft","steamcraftOre",0,1,Ores,event);
	}
  
  public static void FossilsAndArcheology(FMLPreInitializationEvent event) {
    String[] BLOCKS = {"amberOre","fossil"};
    String[] NAMES = {"fAmber", "fFossil"};
    UBCHelper.registerModOresWithoutMeta("fossil", BLOCKS, NAMES, event);
  }
  
  public static void GalactiCraft(FMLPreInitializationEvent event)
  {
    String Ores[] = {"galacticraftAluminum","galacticraftCopper","galacticraftSilicon","galacticraftTin"};
    UBCHelper.registerModOresWithMeta("GalacticraftCore","tile.gcBlockCore",5,1,Ores,event);
  }

	public static void Harvestcraft(FMLPreInitializationEvent event)
	{
		Block HCOreBlock = GameRegistry.findBlock("harvestcraft","salt");
		UBCHelper.registerOreBlock(HCOreBlock,0,"salt",event);
	}

	public static void IC2(FMLPreInitializationEvent event)
	{
		String[] BLOCKS = {"blockOreCopper","blockOreTin","blockOreLead","blockOreUran"};
		String[] NAMES = {"copper","tin","lead","uranium"};
		UBCHelper.registerModOresWithoutMeta("IC2",BLOCKS,NAMES,event);
	}

	public static void IC2Classic(FMLPreInitializationEvent event)
	{
		String[] BLOCKS = {"uraniumOre","tinOre","copperOre"};
		String[] NAMES = {"uranium","tin","copper"};
		UBCHelper.registerModOresWithoutMeta("IC2",BLOCKS,NAMES,event);
	}
  
  public static void JaffasAndMore(FMLPreInitializationEvent event)
  {
    String jaffasModName = "Jaffas-Technic";
    Block jaffarrolOre = GameRegistry.findBlock(jaffasModName, "tile.jaffas.jaffarrolOre");
    Block limsewOre = GameRegistry.findBlock(jaffasModName, "tile.jaffas.limsewOre");
    // meta of 1 used to denote naturally spawned ore (drops xp orbs when mined)
    UBCHelper.registerOreBlock(jaffarrolOre, 1, "jaffarrol", event);
    UBCHelper.registerOreBlock(limsewOre, 0, "limsew", event);
  }


	public static void MagicalCrops(FMLPreInitializationEvent event)
	{
		Block magCropOre = GameRegistry.findBlock("magicalcrops","magicalcrops_EssenceOre");
		UBCHelper.registerOreBlock(magCropOre, 0, "magicalcrops", "EssenceOre_layer", "mcEssenceOre", null);
	}

	public static void Mekanism(FMLPreInitializationEvent event)
	{
		String[] NAMES = {"osmium","copper","tin"};
		UBCHelper.registerModOresWithMeta("Mekanism","OreBlock",0,1,NAMES,event);
	}

	public static void ProjectRed(FMLPreInitializationEvent event)
	{
		String[] NAMES = {"ruby","sapphire","peridot","copper","tin","silver","electrotine"};
		UBCHelper.registerModOresWithMeta("ProjRed|Exploration","projectred.exploration.ore",0,1,NAMES,null);
	}

	public static void Railcraft(FMLPreInitializationEvent event)
	{

		Block RCOreBlock = GameRegistry.findBlock("Railcraft","ore");
		//UBCHelper.registerOreBlock(RCOreBlock,0,"sulfur",event);
		UBCHelper.registerOreBlock(RCOreBlock,0,"railcraft","ore.sulfur","sulfur",event);

		//Temporarily disabled due to Ores registering under the wrong Ore Dictionary Tag.
		//String[] NAMES = {"Iron","Gold","Copper","Tin","Lead"};
		//for(int Ore=0;(Ore<NAMES.length);Ore++)
		//{
		//	UBCHelper.registerOreBlock(RCOreBlock,Ore+7,"railcraft","ore.poor."+ NAMES[Ore].toLowerCase(),"poor" + NAMES[Ore],event);
		//}

	}
  
  public static void RFTools(FMLPreInitializationEvent event) {
    Block dimensionalShard = GameRegistry.findBlock("rftools", "dimensionalShardBlock");
    UBCHelper.registerOreBlock(dimensionalShard, 0, "dimensionalShard", event);
  }

	public static void Steamcraft2(FMLPreInitializationEvent event)
	{
		String[] NAMES = {"aluminum","copper","tin", "zinc","uranite","brimstone","phosphate"};
		UBCHelper.registerModOresWithMeta("steamcraft2","BlockSteamcraftOre",0,1,NAMES,event);
	}
  
  public static void TaintedMagic(FMLPreInitializationEvent event)
  {
    Block ShadowOreBlock = GameRegistry.findBlock("TaintedMagic", "OreShadow");
    UBCHelper.registerOreBlock(ShadowOreBlock, 0, "shadow", event);
  }

	public static void ThermalFoundation(FMLPreInitializationEvent event)
	{
		String[] NAMES = {"copper","tin","silver","lead","ferrous","shiny","manainfused"};
		UBCHelper.registerModOresWithMeta("ThermalFoundation","Ore",0,1,NAMES,event);
	}

	public static void Thaumcraft(FMLPreInitializationEvent event)
	{
		String[] NAMES = {"cinnibar","shardAir","shardFire","shardWater","shardEarth","shardOrder","shardEntropy","tcamber"};
		UBCHelper.registerModOresWithMeta("Thaumcraft","blockCustomOre",0,1,NAMES,event);
	}

	public static void Forestry(FMLPreInitializationEvent event)
	{
		String[] NAMES = {"apatite","copper","tin"};
		UBCHelper.registerModOresWithMeta("Forestry","resources",0,1,NAMES,event);
	}

	/*public static void TConstruct(FMLPreInitializationEvent event)
	{
		String[] NAMES = {"copper","tin","aluminum"};
		UBCHelper.registerModOresWithMeta("TConstruct","SearedBrick",3,1,NAMES,event);
	}*/

	public static void BluePower(FMLPreInitializationEvent event)
	{
		String[] BLOCKS = {"teslatite_ore","copper_ore","silver_ore","zinc_ore","tungsten_ore","ruby_ore","sapphire_ore","amethyst_ore"};
		String[] NAMES = {"teslatite","copper","silver","zinc", "tungsten","ruby","sapphire","amethyst"};
		UBCHelper.registerModOresWithoutMeta("bluepower",BLOCKS,NAMES,event);
	}

	public static void ImmEng(FMLPreInitializationEvent event)
	{
		String[] NAMES = {"copper","bauxite","lead","silver","nickel"};
		UBCHelper.registerModOresWithMeta("ImmersiveEngineering","ore",0,1,NAMES,event);
	}

	public static void ArsMag(FMLPreInitializationEvent event)
	{
		String[] NAMES = {"vinteum","chimerite","bluetopaz","moonstone"};
		UBCHelper.registerModOresWithMeta("arsmagica2","vinteumOre",0,1,NAMES,null);
	}

}
