package com.mr208.UBCOres.Mods;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mr208.UBCOres.UBCHelper;
import net.minecraft.block.Block;

public class Thaumcraft {

    public static Block TCOreBlock;

    public static void preInit(FMLPreInitializationEvent event)
    {
        TCOreBlock = GameRegistry.findBlock("Thaumcraft","blockCustomOre");
        String Ores[] = {"cinnibar","shardAir","shardFire","shardWater","shardEarth","shardOrder","shardEntropy","tcamber"};
        int counter = 0;
        for (String Ore : Ores)
        {
            UBCHelper.registerOreBlock(TCOreBlock,counter,Ore,event);
            counter++;
        }
    }
}
