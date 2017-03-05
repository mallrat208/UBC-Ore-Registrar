package com.mr208.UBCOres;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import exterminatorjeff.undergroundbiomes.intermod.OresRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void onPreInit(FMLPreInitializationEvent event) {
		super.onPreInit(event);
		OresRegistry.INSTANCE.registerOreModels();
	}
}
