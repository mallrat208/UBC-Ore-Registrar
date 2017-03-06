package com.mr208.UBCOres;

import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import exterminatorjeff.undergroundbiomes.intermod.OresRegistry;

public class UBCHelper {

    public static void registerOreBlock(Block block, int meta, Ores ore)
    {
        OresRegistry.INSTANCE.setupOre(block, meta);
        OresRegistry.INSTANCE.registerOreOverlay(block, meta, ore.getTexture());
    }

    public static void registerOreBlock(Block block, Ores ore)
    {
        registerOreBlock(block, 0, ore);
    }

    public static void registerOreBlock(String MODID, String BLOCKNAME, Ores Ore)
    {
        Block ModBlock = Block.getBlockFromName(MODID + ":" + BLOCKNAME);
        registerOreBlock(ModBlock,Ore);
    }

    public static void registerModOresWithMeta(String MODID, String BLOCKNAME, int METASTART, int METASTEP, Ores[] ores)
    {

        Block ModOreBlock = Block.getBlockFromName(MODID+":"+BLOCKNAME);
        int counter = METASTART;
        for (Ores ore: ores)
        {
            UBCHelper.registerOreBlock(ModOreBlock, counter, ore);
            counter = counter + METASTEP;
        }
    }
    public static void registerModOresWithoutMeta(String MODID, String[] BLOCKNAME,Ores[] ores)
    {
        if (BLOCKNAME.length != ores.length)
        {
            Log.error("Array Mismatch while setting up " + MODID + " Ores. Skipping.");
            return;
        }
        for (int Ore = 0; Ore < BLOCKNAME.length; Ore++)
        {
            Block ModBlock = Block.getBlockFromName(MODID+":"+BLOCKNAME[Ore]);
            UBCHelper.registerOreBlock(ModBlock, ores[Ore]);
        }
    }
    public enum Ores{
        ALUMINUM("aluminum"),
        AMBER("amber"),
        ANGLESITE("anglesite"),
        APATITE("apatite"),
        BEEF("beef"),
        BENITOITE("benitiote"),
        BIOME_ESSENCE("biome_essence"),
        BLUE_TOPAZ("blue_topaz"),
        BONE("bone"),
        CADMIUM("cadmium"),
        CARROT("carrot"),
        CERTUS_QUARTZ("certus_quartz"),
        CERTUS_QUARTZ_CHARGED("certus_quartz_charged"),
        CHICKEN("chicken"),
        CHIMERITE("chimerite"),
        CHROMIUM("chromium"),
        COBALT("cobalt"),
        COPPER("copper"),
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
        RESONATING("resonating"),
        ROTTEN("rotten"),
        RUBY("ruby"),
        SAPPHIRE("sapphire"),
        SILVER("silver"),
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
        VINTEUM("vintium"),
        YELLORITE("yellorite"),
        ZINC("zinc"),
        ZIRCONIUM("zirconium");

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
