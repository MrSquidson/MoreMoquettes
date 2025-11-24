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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_MOQUETTE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_MOQUETTE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
