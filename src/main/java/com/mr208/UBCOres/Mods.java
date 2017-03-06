package com.mr208.UBCOres;

import com.mr208.UBCOres.UBCHelper.Ores;

public class Mods {

    public static void ThermalFoundation() {
        Ores[] ORES = {Ores.COPPER, Ores.TIN, Ores.SILVER, Ores.LEAD, Ores.ALUMINUM, Ores.NICKEL, Ores.PLATINUM, Ores.IRIDIUM, Ores.MANA_INFUSED};
        UBCHelper.registerModOresWithMeta("thermalfoundation", "ore", 0, 1,ORES);
    }

    public static void  AppliedEnergistics2() {
        Ores[] ORES = {Ores.CERTUS_QUARTZ,Ores.CERTUS_QUARTZ_CHARGED};
        String[] BLOCKNAMES = {"quartz_ore","charged_quartz_ore"};
        UBCHelper.registerModOresWithoutMeta("appliedenergistics2", BLOCKNAMES, ORES);
    }

    public static void Forestry() {
        Ores[] ORES = {Ores.APATITE,Ores.COPPER,Ores.TIN};
        UBCHelper.registerModOresWithMeta("forestry","resources",0,1,ORES);
    }

    public static void DeepResonance(){
        String[] BLOCKNAMES = {"resonating_ore"};
        Ores[] ORES = {Ores.RESONATING};
        UBCHelper.registerModOresWithoutMeta("deepresonance",BLOCKNAMES,ORES);
    }

    public static void BiomesOPlenty() {
        Ores[] ORES = {Ores.RUBY, Ores.PERIDOT, Ores.TOPAZ, Ores.TANZANITE, Ores.MALACHITE,Ores.SAPPHIRE, Ores.AMBER};
        UBCHelper.registerModOresWithMeta("biomesoplenty","gem_ore",1,1,ORES);
    }

    public static void ImmersiveEngineering() {
        Ores[] ORES = {Ores.COPPER, Ores.ALUMINUM, Ores.LEAD, Ores.SILVER, Ores.NICKEL, Ores.URANIUM};
        UBCHelper.registerModOresWithMeta("immersiveengineering","ore",0,1,ORES);
    }

    public static void BigReactors() {
        Ores[] ORES = {Ores.YELLORITE};
        UBCHelper.registerModOresWithMeta("bigreactors","brore",0,1,ORES);
    }

    public static void Embers() {
        Ores[] ORES = {Ores.COPPER,Ores.LEAD,Ores.SILVER};
        String[] BLOCKNAMES = {"oreCopper","oreLead","oreSilver"};
        UBCHelper.registerModOresWithoutMeta("embers", BLOCKNAMES, ORES);
    }

    public static void ArsMagica2() {
        Ores[] ORES = {Ores.VINTEUM,Ores.CHIMERITE,Ores.BLUE_TOPAZ,Ores.MOONSTONE};
        UBCHelper.registerModOresWithMeta("arsmagica2","ore",0,1,ORES);
    }

    public static void Magneticraft() {
        Ores[] ORES = {Ores.COPPER,Ores.LEAD,Ores.COBALT,Ores.TUNGSTEN};
        UBCHelper.registerModOresWithMeta("magneticraft","ore_block",0,1,ORES);
    }

    public static void DraconicEvolution() {
        Ores[] ORES = {Ores.DRACONIUM};
        UBCHelper.registerModOresWithMeta("draconicevolution","draconium_ore",0,1,ORES);
    }

    public static void MysticalAgriculture() {
        Ores[] ORES = {Ores.PROSPERITY,Ores.INFERIUM};
        String[] BLOCKNAMES = {"prosperity_ore","inferium_ore"};
        UBCHelper.registerModOresWithoutMeta("mysticalagriculture",BLOCKNAMES,ORES);
    }

    public static void Railcraft() {
        Ores[] ORES = {Ores.COPPER,Ores.TIN,Ores.LEAD,Ores.SILVER};
        UBCHelper.registerModOresWithMeta("railcraft","ore",11,1,ORES);

    }

    public static void RailcraftPoorOres() {
        Ores[] ORES = {Ores.POOR_IRON, Ores.POOR_GOLD, Ores.POOR_COPPER, Ores.POOR_TIN, Ores.POOR_LEAD,Ores.POOR_SILVER};
        UBCHelper.registerModOresWithMeta("railcraft","ore",5,1,ORES);
    }

    public static void Mekanism() {
        Ores[] ORES = {Ores.OSMIUM,Ores.COPPER,Ores.TIN};
        UBCHelper.registerModOresWithMeta("mekanism","OreBlock",0,1,ORES);
    }




}
