package org.mrsquidson.block;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarpetBlock;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.mrsquidson.Moremoquettes;

public class ModBlocks {

    // Creative Item Group
    public static final RegistryKey<ItemGroup> BUILDING_BLOCKS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Moremoquettes.MOD_ID, "item_group"));
    public static final ItemGroup BUILDING_BLOCKS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.YELLOW_MOQUETTE))
            .displayName(Text.translatable("buildGroup.Moquettes"))
            .build();

    // "Normal Blocks"
    public static final Block BLACK_MOQUETTE = registerBlock("black_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block CYAN_MOQUETTE = registerBlock("cyan_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block GRAY_MOQUETTE = registerBlock("gray_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block GREEN_MOQUETTE = registerBlock("green_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block LIGHT_BLUE_MOQUETTE = registerBlock("light_blue_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block LIGHT_GRAY_MOQUETTE = registerBlock("light_gray_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block LIME_MOQUETTE = registerBlock("lime_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.LIME_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block MAGENTA_MOQUETTE = registerBlock("magenta_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block ORANGE_MOQUETTE = registerBlock("orange_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block PINK_MOQUETTE = registerBlock("pink_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.PINK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block PURPLE_MOQUETTE = registerBlock("purple_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block WHITE_MOQUETTE = registerBlock("white_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block YELLOW_MOQUETTE = registerBlock("yellow_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).strength(-1.0f,3600000.0f)));

    // Start Carpets
    public static final Block BLACK_MOQUETTE_CARPET = registerBlock("black_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block CYAN_MOQUETTE_CARPET = registerBlock("cyan_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block GRAY_MOQUETTE_CARPET = registerBlock("gray_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block GREEN_MOQUETTE_CARPET = registerBlock("green_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block LIGHT_BLUE_MOQUETTE_CARPET = registerBlock("light_blue_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block LIGHT_GRAY_MOQUETTE_CARPET = registerBlock("light_gray_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block LIME_MOQUETTE_CARPET = registerBlock("lime_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIME_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block MAGENTA_MOQUETTE_CARPET = registerBlock("magenta_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block ORANGE_MOQUETTE_CARPET = registerBlock("orange_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block PINK_MOQUETTE_CARPET = registerBlock("pink_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.PINK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block PURPLE_MOQUETTE_CARPET = registerBlock("purple_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block WHITE_MOQUETTE_CARPET = registerBlock("white_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block YELLOW_MOQUETTE_CARPET = registerBlock("yellow_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET).strength(-1.0f,3600000.0f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Moremoquettes.MOD_ID,name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Moremoquettes.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Moremoquettes.LOGGER.info("Weaving carpets and making blocks for " + Moremoquettes.MOD_ID);

        Registry.register(Registries.ITEM_GROUP, BUILDING_BLOCKS_KEY, BUILDING_BLOCKS);

        ItemGroupEvents.modifyEntriesEvent(ModBlocks.BUILDING_BLOCKS_KEY).register(BUILDING_BLOCKS -> {
            // Normal Blocks
            BUILDING_BLOCKS.add(ModBlocks.BLACK_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.CYAN_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.GRAY_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.GREEN_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.LIGHT_BLUE_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.LIGHT_GRAY_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.LIME_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.MAGENTA_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.ORANGE_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.PINK_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.PURPLE_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.WHITE_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.YELLOW_MOQUETTE);

            // Carpets
            BUILDING_BLOCKS.add(ModBlocks.BLACK_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.CYAN_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.GRAY_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.GREEN_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.LIGHT_BLUE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.LIGHT_GRAY_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.LIME_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.MAGENTA_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.ORANGE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.PINK_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.PURPLE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.WHITE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.YELLOW_MOQUETTE_CARPET);
    });
    }
}
