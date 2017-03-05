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
            UBCHelper.registerOreBlock(ModBlock, 0, ores[Ore]);
        }
    }
    public enum Ores{
        ALUMINUM("aluminum"),
        AMBER("amber"),
        ANGLESITE("anglesite"),
        APATITE("apatite"),
        BENITOITE("benitiote"),
        BIOME_ESSENCE("biome_essence"),
        CERTUS_QUARTZ("certus_quartz"),
        CERTUS_QUARTZ_CHARGED("certus_quartz_charged"),
        COPPER("copper"),
        DIMENSIONAL_SHARD("dimenstional_shard"),
        DRACONIUM("draconium"),
        INFERIUM("inferium"),
        IRIDIUM("iridium"),
        LEAD("lead"),
        MALACHITE("malachite"),
        MANA_INFUSED("mana_infused"),
        NICKEL("nickel"),
        OSMIUM("osmium"),
        PERIDOT("peridot"),
        PLATINUM("platinum"),
        PROSPERITY("prosperity"),
        RESONATING("resonating"),
        RUBY("ruby"),
        SAPPHIRE("sapphire"),
        SILVER("silver"),
        SULFUR("sulfur"),
        TANZANITE("tanzanite"),
        TIN("tin"),
        TOPAZ("topaz"),
        URANIUM("uranium"),
        YELLORITE("yellorite");

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
