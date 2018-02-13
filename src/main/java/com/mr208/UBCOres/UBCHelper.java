package com.mr208.UBCOres;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import exterminatorjeff.undergroundbiomes.api.UBBiome;
import exterminatorjeff.undergroundbiomes.intermod.OresRegistry;
import exterminatorjeff.undergroundbiomes.intermod.StonesRegistry;

public class UBCHelper {

    public static void registerOreBlock(String MODID, String BLOCKNAME, int meta, Ores ore)
    {
        Block OreBlock = Block.getBlockFromName(MODID+":"+BLOCKNAME);
        if(OreBlock!=null) {
            Log.info("Registering Ore <"+MODID+":"+BLOCKNAME+":"+meta+">" + "with Unlocalized Name of: " + OreBlock.getUnlocalizedName());
            OresRegistry.INSTANCE.setupOre(OreBlock, meta);
            OresRegistry.INSTANCE.registerOreOverlay(OreBlock, meta, ore.getTexture());
        } else {
            Log.error("Skipping Ore: Unable to find Block for <"+MODID+":"+BLOCKNAME+":"+meta+">");
        }
    }

    public static void registerOreBlock(String MODID, String BLOCKNAME, Ores Ore)
    {
        registerOreBlock(MODID, BLOCKNAME, 0, Ore);
    }

    public static void registerModOres(String MODID, String BLOCKNAME, int METASTART, int METASTEP, Ores[] ores)
    {
        int counter = METASTART;
        for (Ores ore: ores)
        {
            UBCHelper.registerOreBlock(MODID,BLOCKNAME,counter,ore);
            counter = counter + METASTEP;
        }
    }
    public static void registerModOres(String MODID, String[] BLOCKNAME,Ores[] ores)
    {
        if (BLOCKNAME.length != ores.length)
        {
            Log.error("Array Mismatch while setting up " + MODID + " Ores. Skipping.");
            return;
        }
        for (int Ore = 0; Ore < BLOCKNAME.length; Ore++)
        {
            UBCHelper.registerOreBlock(MODID, BLOCKNAME[Ore],ores[Ore]);
        }
    }
    public enum Ores{
        ALUMINUM("aluminum"),
        AMBER("amber"),
        AMBER_TC("amber_tc"),
        ANGLESITE("anglesite"),
        APATITE("apatite"),
        BEEF("beef"),
        BENITOITE("benitiote"),
        BIOME_ESSENCE("biome_essence"),
        BLACK_QUARTZ("black_quartz"),
        BLUE_TOPAZ("blue_topaz"),
        BONE("bone"),
        CADMIUM("cadmium"),
        CARROT("carrot"),
        CERTUS_QUARTZ("certus_quartz"),
        CERTUS_QUARTZ_CHARGED("certus_quartz_charged"),
        CINNABAR_TC("cinnabar_tc"),
        CHICKEN("chicken"),
        CHIMERITE("chimerite"),
        CHROMIUM("chromium"),
        COBALT("cobalt"),
        COPPER("copper"),
        CRYSTAL("crystal"),
        DARK("darkore"),
        DILITHIUM("dilithium"),
        DIMENSIONAL_SHARD("dimensional_shard"),
        DRACONIUM("draconium"),
        ELECTROTINE("electrotine"),
        ENDER("ender"),
        FEATHER("feather"),
        FISH("fish"),
        FLINT("flint"),
        GALENA("galena"),
        GALVANIZED_STEEL("galvanized_steel"),
        HEART_CRYSTAL("heart_crystal"),
        INFERIUM("inferium"),
        IRIDIUM("iridium"),
        LEAD("lead"),
        MAGNESIUM("magnesium"),
        MALACHITE("malachite"),
        MANA_INFUSED("mana_infused"),
        MANGANESE("manganese"),
        MELON("melon"),
        MERCURY("mercury"),
        MOONSTONE("moonstone"),
        NAQUADAH("naquadah"),
        NATIVE_COPPER("native_copper"),
        NICHROME("nichrome"),
        NICKEL("nickel"),
        NITER("niter"),
        OSMIUM("osmium"),
        PERIDOT("peridot"),
        PLATINUM("platinum"),
        PLUTONIUM("plutonium"),
        POOR_COPPER("poor_copper"),
        POOR_IRON("poor_iron"),
        POOR_GOLD("poor_gold"),
        POOR_LEAD("poor_lead"),
        POOR_SILVER("poor_silver"),
        POOR_TIN("poor_tin"),
        PORKCHOP("porkchop"),
        POTATO("potato"),
        PRISMARINE("prismarine"),
        PROSPERITY("prosperity"),
        QUARTZ("quartz_tc"),
        RESONATING("resonating"),
        ROTTEN("rotten"),
        RUBY("ruby"),
        SAPPHIRE("sapphire"),
        SILVER("silver"),
        SLATE("slate"),
        SLIME("slime"),
        STAINLESS_STEEL("stainless_steel"),
        SULFUR("sulfur"),
        TANTALUM("tantalum"),
        TANZANITE("tanzanite"),
        TIN("tin"),
        TITANIUM("titanium"),
        TOPAZ("topaz"),
        TUNGSTEN("tungsten"),
        URANIUM("uranium"),
        VIBRANIUM("vibranium"),
        VINTEUM("vinteum"),
        YELLORITE("yellorite"),
        ZINC("zinc"),
        ZIRCONIUM("zirconium"),
        SIMPLE_RUBY("simple_ruby"),
        SIMPLE_GARNET("simple_garnet"),
        SIMPLE_TOPAZ("simple_topaz"),
        SIMPLE_AMBER("simple_amber"),
        SIMPLE_HELIODOR("simple_heliodor"),
        SIMPLE_PERIDOT("simple_peridot"),
        SIMPLE_BERYL("simple_beryl"),
        SIMPLE_INDICOLITE("simple_indicolite"),
        SIMPLE__AQUAMARINE("simple_aquamarine"),
        SIMPLE_SAPPHIRE9("simple_sapphire"),
        SIMPLE_IOLITE("simple_iolite"),
        SIMPLE_AMETHYST("simple_amethyst"),
        SIMPLE_AGATE("simple_agate"),
        SIMPLE_MORGANITE("simple_morganite"),
        SIMPLE_ONYX("simple_onyx"),
        SIMPLE_OPAL("simple_opal");

        private String name;

        Ores(String oreName){
            this.name = oreName;
        }

        public String getName() {
            return name;
        }

        public ResourceLocation getTexture() {
            return new ResourceLocation(References.MODID + ":blocks/" + name + "_overlay");
        }
    }
}
