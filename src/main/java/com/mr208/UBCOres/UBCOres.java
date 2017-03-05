package com.mr208.UBCOres;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = References.MODID, name = References.MODNAME, dependencies = References.DEPENDENCIES, version = References.VERSION)
public class UBCOres {


@Mod.Instance(References.MODID)
public static UBCOres instance;

@SidedProxy(clientSide = "com.mr208.UBCOres.ClientProxy", serverSide = "com.mr208.UBCOres.CommonProxy", modId = References.MODID)
public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        Config.init(event.getSuggestedConfigurationFile());
        proxy.onPreInit(event);

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {


    }
}
