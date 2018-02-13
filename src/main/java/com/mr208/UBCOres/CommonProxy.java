package com.mr208.UBCOres;

import net.minecraftforge.event.world.ChunkEvent.Load;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void onPreInit(FMLPreInitializationEvent event) {

		if(Loader.isModLoaded("thermalfoundation") && Config.TFOres) Mods.ThermalFoundation();
		if(Loader.isModLoaded("appliedenergistics2") && Config.AE2Ores) Mods.AppliedEnergistics2();
		if(Loader.isModLoaded("deepresonance") && Config.DROres) Mods.DeepResonance();
		if(Loader.isModLoaded("bigreactors") && Config.BROres) Mods.BigReactors();
		if(Loader.isModLoaded("BiomesOPlenty") && Config.BOPOres) Mods.BiomesOPlenty();
		if(Loader.isModLoaded("immersiveengineering") && Config.IEOres) Mods.ImmersiveEngineering();
		if(Loader.isModLoaded("forestry") && Config.ForestryOres) Mods.Forestry();
		if(Loader.isModLoaded("embers") && Config.EmbersOres) Mods.Embers();
		if(Loader.isModLoaded("arsmagica2") && Config.AM2Ores) Mods.ArsMagica2();
		if(Loader.isModLoaded("magneticraft") && Config.MagniOres) Mods.Magneticraft();
		if(Loader.isModLoaded("draconicevolution") && Config.DEOres) Mods.DraconicEvolution();
		if(Loader.isModLoaded("mysticalagriculture") && Config.MAOres) Mods.MysticalAgriculture();
		if(Loader.isModLoaded("railcraft") && Config.RailOres) Mods.Railcraft();
		if(Loader.isModLoaded("railcraft") && Config.RailPoorOres) Mods.RailcraftPoorOres();
		if(Loader.isModLoaded("mekanism") && Config.MekaOres) Mods.Mekanism();
		if(Loader.isModLoaded("sgcraft") && Config.SGCores) Mods.SGCraft();
		if(Loader.isModLoaded("rftools") && Config.RFTOres) Mods.RFTools();
		if(Loader.isModLoaded("advancedrocketry") && Config.AROres) Mods.AdvancedRocketry();
		if(Loader.isModLoaded("projectred-exploration") && Config.PREOres) Mods.ProjectRedExploration();
		if(Loader.isModLoaded("crossroads") && Config.CrossOres) Mods.Crossroads();
		if(Loader.isModLoaded("techreborn") && Config.TROres) Mods.TechReborn();
		if(Loader.isModLoaded("basemetals") && Config.BMOres) Mods.BaseMetals();
		if(Loader.isModLoaded("modernmetals") && Config.MMOres) Mods.ModernMetals();
		if(Loader.isModLoaded("substratum") && Config.SubOres) Mods.Substratum();
		if(Loader.isModLoaded("utilitybaseores") && Config.UBOres) Mods.UtilityBaseOres();
		if(Loader.isModLoaded("druidry") && Config.DruidOres) Mods.Druidry();
		if(Loader.isModLoaded("betteragriculture") && Config.BetterAgOres) Mods.BetterAgriculture();
		if(Loader.isModLoaded("actuallyadditions") && Config.AAOres) Mods.ActuallyAdditions();
		if(Loader.isModLoaded("scalinghealth") && Config.SHOres) Mods.ScalingHealth();
		if(Loader.isModLoaded("hardcoreore") && Config.HCOres) Mods.HardcoreORE();
		if(Loader.isModLoaded("taiga") && Config.TAIOres) Mods.TAIGA();
		if(Loader.isModLoaded("thaumcraft") && Config.TCOres) Mods.Thaumcraft();
		if(Loader.isModLoaded("wizardry") && Config.Wizardry) Mods.Wizardry();
		if(Loader.isModLoaded("evilcraft") && Config.Evilcraft) Mods.Evilcraft();
		if(Loader.isModLoaded("silentgems") && Config.Silents) Mods.SilentsGems();
	}
}
