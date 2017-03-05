package com.mr208.UBCOres;

import com.mr208.UBCOres.UBCHelper.Ores;

public class Mods {

    public static void ThermalFoundation()
    {
        Ores[] ORES = {Ores.COPPER, Ores.TIN, Ores.SILVER, Ores.LEAD, Ores.ALUMINUM, Ores.NICKEL, Ores.PLATINUM, Ores.IRIDIUM, Ores.MANA_INFUSED};
        UBCHelper.registerModOresWithMeta("thermalfoundation", "ore", 0, 1,ORES);
    }

    public static void  AppliedEnergistics2()
    {
        Ores[] ORES = {Ores.CERTUS_QUARTZ,Ores.CERTUS_QUARTZ_CHARGED};
        String[] BLOCKNAMES = {"quartz_ore","charged_quartz_ore"};
        UBCHelper.registerModOresWithoutMeta("appliedenergistics2", BLOCKNAMES, ORES);
    }

}
