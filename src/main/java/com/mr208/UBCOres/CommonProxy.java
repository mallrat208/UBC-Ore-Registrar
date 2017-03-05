package com.mr208.UBCOres;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void onPreInit(FMLPreInitializationEvent event) {

		if(Loader.isModLoaded("thermalfoundation") && Config.TFOres) Mods.ThermalFoundation();
		if(Loader.isModLoaded("appliedenergistics2") && Config.AE2Ores) Mods.AppliedEnergistics2();

	}
}
