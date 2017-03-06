package com.mr208.UBCOres;

import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void onPreInit(FMLPreInitializationEvent event) {

		if(Loader.isModLoaded("thermalfoundation") && Config.TFOres) Mods.ThermalFoundation();
		if(Loader.isModLoaded("appliedenergistics2") && Config.AE2Ores) Mods.AppliedEnergistics2();
		if(Loader.isModLoaded("deepresonance") && Config.DROres) Mods.DeepResonance();
		if(Loader.isModLoaded("bigreactors") && Config.BROres) Mods.BigReactors();
		if(Loader.isModLoaded("biomesoplenty") && Config.BOPOres) Mods.BiomesOPlenty();
		if(Loader.isModLoaded("immersiveengineering") && Config.IEOres) Mods.ImmersiveEngineering();
		if(Loader.isModLoaded("forestry") && Config.ForestryOres) Mods.Forestry();
		if(Loader.isModLoaded("embers") && Config.EmbersOres) Mods.Embers();
		if(Loader.isModLoaded("arsmagica2") && Config.AM2Ores) Mods.ArsMagica2();
		if(Loader.isModLoaded("magneticraft") && Config.MagniOres) Mods.Magneticraft();
		if(Loader.isModLoaded("draconicevolution") && Config.DEOres) Mods.DraconicEvolution();
		if(Loader.isModLoaded("mysticalagriculture") && Config.MAOres) Mods.MysticalAgriculture();
		if(Loader.isModLoaded("railcraft") && Config.RailOres) Mods.Railcraft();
		if(Loader.isModLoaded("railcraft") && Config.RailPoorOres) Mods.RailcraftPoorOres();

	}
}
