package com.mr208.UBCOres;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void onPreInit(FMLPreInitializationEvent event) {


		if(Loader.isModLoaded("thermalfoundation") && Config.TFOres)
		{
			Mods.ThermalFoundation();
		}



	}
}
