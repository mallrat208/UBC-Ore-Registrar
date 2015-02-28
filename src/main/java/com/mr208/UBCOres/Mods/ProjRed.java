package com.mr208.UBCOres.Mods;

import com.mr208.UBCOres.UBCHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ProjRed {

    public static void init()
    {
        Block projRedOre = GameRegistry.findBlock("ProjRed|Exploration", "projectred.exploration.ore");
        int counter = 0;
        String[] Ores = {"ruby","sapphire","peridot"};
        for(String Ore: Ores)
        {
            UBCHelper.registerOreBlock(projRedOre, counter, Ore,null);
            counter++;
        }


    }
}
