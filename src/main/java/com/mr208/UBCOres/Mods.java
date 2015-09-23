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

	public static void Steamcraft2(FMLPreInitializationEvent event)
	{
		String[] NAMES = {"aluminum","copper","tin", "zinc","uranite","brimstone","phosphate"};
		UBCHelper.registerModOresWithMeta("steamcraft2","BlockSteamcraftOre",0,1,NAMES,event);
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
	
	public static void BigReactors(FMLPreInitializationEvent event)
	{
		Block BLOCK = GameRegistry.findBlock("DraconicEvolution","draconiumOre");
		UBCHelper.registerOreBlock(BLOCK, 0, "draconium", event);
	}
}
