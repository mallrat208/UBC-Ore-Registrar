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

	}
}
