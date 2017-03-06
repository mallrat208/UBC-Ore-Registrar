package com.mr208.UBCOres;

import com.mr208.UBCOres.UBCHelper.Ores;

public class Mods {

    public static void ThermalFoundation() {
        Ores[] ORES = {Ores.COPPER, Ores.TIN, Ores.SILVER, Ores.LEAD, Ores.ALUMINUM, Ores.NICKEL, Ores.PLATINUM, Ores.IRIDIUM, Ores.MANA_INFUSED};
        UBCHelper.registerModOres("thermalfoundation", "ore", 0, 1,ORES);
    }

    public static void  AppliedEnergistics2() {
        Ores[] ORES = {Ores.CERTUS_QUARTZ,Ores.CERTUS_QUARTZ_CHARGED};
        String[] BLOCKNAMES = {"quartz_ore","charged_quartz_ore"};
        UBCHelper.registerModOres("appliedenergistics2", BLOCKNAMES, ORES);
    }

    public static void Forestry() {
        Ores[] ORES = {Ores.APATITE,Ores.COPPER,Ores.TIN};
        UBCHelper.registerModOres("forestry","resources",0,1,ORES);
    }

    public static void DeepResonance(){
        UBCHelper.registerOreBlock("deepresonance","resonating_ore",Ores.RESONATING);
    }

    public static void BiomesOPlenty() {
        Ores[] ORES = {Ores.RUBY, Ores.PERIDOT, Ores.TOPAZ, Ores.TANZANITE, Ores.MALACHITE,Ores.SAPPHIRE, Ores.AMBER};
        UBCHelper.registerModOres("biomesoplenty","gem_ore",1,1,ORES);
    }

    public static void ImmersiveEngineering() {
        Ores[] ORES = {Ores.COPPER, Ores.ALUMINUM, Ores.LEAD, Ores.SILVER, Ores.NICKEL, Ores.URANIUM};
        UBCHelper.registerModOres("immersiveengineering","ore",0,1,ORES);
    }

    public static void BigReactors() {
        Ores[] ORES = {Ores.YELLORITE};
        UBCHelper.registerModOres("bigreactors","brore",0,1,ORES);
    }

    public static void Embers() {
        Ores[] ORES = {Ores.COPPER,Ores.LEAD,Ores.SILVER};
        String[] BLOCKNAMES = {"oreCopper","oreLead","oreSilver"};
        UBCHelper.registerModOres("embers", BLOCKNAMES, ORES);
    }

    public static void ArsMagica2() {
        Ores[] ORES = {Ores.VINTEUM,Ores.CHIMERITE,Ores.BLUE_TOPAZ,Ores.MOONSTONE};
        UBCHelper.registerModOres("arsmagica2","ore",0,1,ORES);
    }

    public static void Magneticraft() {
        Ores[] ORES = {Ores.COPPER,Ores.LEAD,Ores.COBALT,Ores.TUNGSTEN};
        UBCHelper.registerModOres("magneticraft","ore_block",0,1,ORES);
    }

    public static void DraconicEvolution() {
        UBCHelper.registerOreBlock("draconicevolution","draconium_ore",Ores.DRACONIUM);
    }

    public static void MysticalAgriculture() {
        Ores[] ORES = {Ores.PROSPERITY,Ores.INFERIUM};
        String[] BLOCKNAMES = {"prosperity_ore","inferium_ore"};
        UBCHelper.registerModOres("mysticalagriculture",BLOCKNAMES,ORES);
    }

    public static void Railcraft() {
        Ores[] ORES = {Ores.COPPER,Ores.TIN,Ores.LEAD,Ores.SILVER};
        UBCHelper.registerModOres("railcraft","ore",11,1,ORES);

    }

    public static void RailcraftPoorOres() {
        Ores[] ORES = {Ores.POOR_IRON, Ores.POOR_GOLD, Ores.POOR_COPPER, Ores.POOR_TIN, Ores.POOR_LEAD,Ores.POOR_SILVER};
        UBCHelper.registerModOres("railcraft","ore",5,1,ORES);
    }

    public static void Mekanism() {
        Ores[] ORES = {Ores.OSMIUM,Ores.COPPER,Ores.TIN};
        UBCHelper.registerModOres("mekanism","OreBlock",0,1,ORES);
    }

    public static void SGCraft() {
        UBCHelper.registerOreBlock("sgcraft","naquadahOre",Ores.NAQUADAH);
    }

    public static void RFTools() {
        UBCHelper.registerOreBlock("rftools","dimensional_shard_ore",Ores.DIMENSIONAL_SHARD);
    }

    public static void AdvancedRocketry() {
        UBCHelper.registerOreBlock("libvulpes","ore0",Ores.DILITHIUM);
        Ores[] ORES = {Ores.COPPER, Ores.TIN};
        UBCHelper.registerModOres("libvulpes","ore0",4,1,ORES);
        ORES = new Ores[] {Ores.TITANIUM, Ores.ALUMINUM, Ores.IRIDIUM};
        UBCHelper.registerModOres("libvulpes","ore0",8,1,ORES);

    }

    public static void ProjectRedExploration() {
        Ores[] ORES = {Ores.RUBY, Ores.SAPPHIRE, Ores.PERIDOT, Ores.COPPER, Ores.TIN, Ores.SILVER, Ores.ELECTROTINE};
        UBCHelper.registerModOres("projectred-exploration","ore",0,1,ORES);
    }

    public static void Crossroads() {
        Ores[] ORES = {Ores.TIN, Ores.COPPER, Ores.NATIVE_COPPER};
        String[] BLOCKNAMES = {"oreTin", "oreCopper", "oreNativeCopper"};
        UBCHelper.registerModOres("crossroads",BLOCKNAMES,ORES);
    }

    public static void TechReborn() {
        Ores[] ORES = {Ores.GALENA, Ores.IRIDIUM, Ores.RUBY, Ores.SAPPHIRE, Ores.ALUMINUM};
        UBCHelper.registerModOres("techreborn","techreborn.ore",0,1,ORES);
        ORES = new Ores[] {Ores.LEAD,Ores.SILVER};
        UBCHelper.registerModOres("techreborn","techreborn.ore",12,1,ORES);
        ORES = new Ores[] {Ores.COPPER, Ores.TIN, Ores.NICKEL};
        UBCHelper.registerModOres("techreborn","techreborn.ore2",0,1,ORES);
    }

    public static void BaseMetals() {
        Ores[] ORES = {Ores.COPPER,Ores.LEAD,Ores.MERCURY,Ores.NICKEL, Ores.PLATINUM, Ores.SILVER, Ores.TIN, Ores.ZINC};
        String[] BLOCKNAMES = {"copper_ore","lead_ore","mercury_ore","nickel_ore","platinum_ore","silver_ore","tin_ore","zinc_ore"};
        UBCHelper.registerModOres("basemetals",BLOCKNAMES,ORES);
    }

    public static void ModernMetals() {
        Ores[] ORES = {Ores.ALUMINUM, Ores.CADMIUM, Ores.CHROMIUM, Ores.GALVANIZED_STEEL,Ores.IRIDIUM, Ores.MAGNESIUM, Ores.MANGANESE, Ores.NICHROME, Ores.OSMIUM,Ores.PLUTONIUM, Ores.TUNGSTEN, Ores.STAINLESS_STEEL, Ores.TANTALUM, Ores.TITANIUM, Ores.TUNGSTEN, Ores.URANIUM, Ores.ZIRCONIUM};
        String[] BLOCKNAMES = {"aluminum_ore","cadmium_ore","chromium_ore","galvanizedsteel_ore","iridium_ore","magnesium_ore","manganese_ore","nichrome_ore","osmium_ore","plutonium_ore","rutile_ore","stainlesssteel_ore","tantalum_ore", "titanium_ore","tungsten_ore","uranium_ore","zirconium_ore"};
        UBCHelper.registerModOres("modernmetals", BLOCKNAMES, ORES);
    }

    public static void Substratum() {
        Ores[] ORES = {Ores.COPPER, Ores.TIN, Ores.NICKEL, Ores.ZINC, Ores.SILVER, Ores.LEAD, Ores.PLATINUM,Ores.ALUMINUM, Ores.CHROMIUM};
        UBCHelper.registerModOres("substratum","ore",0,1,ORES);
        ORES = new Ores[]{Ores.SULFUR,Ores.NITER};
        UBCHelper.registerModOres("substratum","oreDust",0,1,ORES);
    }

    public static void UtilityBaseOres() {
        Ores[] ORES = {Ores.FEATHER, Ores.BONE, Ores.ROTTEN, Ores.PRISMARINE, Ores.ENDER,Ores.SLIME, Ores.FLINT, Ores.CARROT, Ores.MELON, Ores.POTATO, Ores.CHICKEN, Ores.BEEF, Ores.PORKCHOP, Ores.FISH};
        String[] BLOCKNAMES = {"feather_ore","bone_ore","rotten_ore","prismarine_ore","ender_ore","slime_ore","flint_ore","carrot_ore","melon_ore","potato_ore","chicken_ore","beef_ore","porkchop_ore","fish_ore"};
        UBCHelper.registerModOres("utilitybaseores",BLOCKNAMES,ORES);
    }

    public static void Druidry() {
        UBCHelper.registerOreBlock("druidry","silverore",Ores.SILVER);
    }

    public static void BetterAgriculture() {
        UBCHelper.registerOreBlock("betteragriculture","slate_ore",Ores.SLATE);
    }

    public static void ActuallyAdditions() {
        UBCHelper.registerModOres("actuallyadditions","blockMisc",3,1,new Ores[]{Ores.BLACK_QUARTZ});
    }

    public static void ScalingHealth() {
        UBCHelper.registerOreBlock("scalinghealth","CrystalOre",Ores.HEART_CRYSTAL);
    }

    public static void HardcoreORE() {
        Ores[] ORES = {Ores.ALUMINUM, Ores.NICKEL, Ores.OSMIUM, Ores.ALUMINUM, Ores.TITANIUM, Ores.PLATINUM, Ores.YELLORITE, Ores.URANIUM, Ores.LEAD, Ores.ZINC, Ores.IRIDIUM, Ores.SILVER, Ores.COPPER, Ores.TIN};
        String[] BLOCKNAMES = {"oreBauxite","oreNickel","oreOsmium","oreAluminum","oreTitanium","ore_platinum","oreYellorium","oreUranium","oreLead","oreZinc","oreIridium","oreSilver","oreCopper","oreTin"};
        UBCHelper.registerModOres("hardcoreore",BLOCKNAMES,ORES);
    }

}
