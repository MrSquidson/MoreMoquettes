package org.mrsquidson.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import org.mrsquidson.block.ModBlocks;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BLACK_MOQUETTE,ModBlocks.BLACK_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.CYAN_MOQUETTE,ModBlocks.CYAN_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.GRAY_MOQUETTE,ModBlocks.GRAY_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.GREEN_MOQUETTE,ModBlocks.GREEN_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIGHT_BLUE_MOQUETTE,ModBlocks.LIGHT_BLUE_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIGHT_GRAY_MOQUETTE,ModBlocks.LIGHT_GRAY_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIME_MOQUETTE,ModBlocks.LIME_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.MAGENTA_MOQUETTE,ModBlocks.MAGENTA_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.ORANGE_MOQUETTE,ModBlocks.ORANGE_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.PINK_MOQUETTE,ModBlocks.PINK_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.PURPLE_MOQUETTE,ModBlocks.PURPLE_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_MOQUETTE,ModBlocks.WHITE_MOQUETTE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.YELLOW_MOQUETTE,ModBlocks.YELLOW_MOQUETTE_CARPET);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
