package org.mrsquidson.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import org.mrsquidson.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        // Menus Etc.
        translationBuilder.add(ModBlocks.BUILDING_BLOCKS_KEY, "TMM: More Moquettes!");

        // Full blocks
        translationBuilder.add(ModBlocks.BLACK_MOQUETTE, "Black Moquette");
        translationBuilder.add(ModBlocks.CYAN_MOQUETTE, "Cyan Moquette");
        translationBuilder.add(ModBlocks.GRAY_MOQUETTE, "Gray Moquette");
        translationBuilder.add(ModBlocks.GREEN_MOQUETTE, "Green Moquette");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_MOQUETTE, "Light Blue Moquette");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_MOQUETTE, "Light Gray Moquette");
        translationBuilder.add(ModBlocks.LIME_MOQUETTE, "Lime Moquette");
        translationBuilder.add(ModBlocks.MAGENTA_MOQUETTE, "Magenta Moquette");
        translationBuilder.add(ModBlocks.ORANGE_MOQUETTE, "Orange Moquette");
        translationBuilder.add(ModBlocks.PINK_MOQUETTE, "Pink Moquette");
        translationBuilder.add(ModBlocks.PURPLE_MOQUETTE, "Purple Moquette");
        translationBuilder.add(ModBlocks.WHITE_MOQUETTE, "White Moquette");
        translationBuilder.add(ModBlocks.YELLOW_MOQUETTE, "Yellow Moquette");

        // Carpet Variants
        translationBuilder.add(ModBlocks.BLACK_MOQUETTE_CARPET, "Black Moquette Carpet");
        translationBuilder.add(ModBlocks.CYAN_MOQUETTE_CARPET, "Cyan Moquette Carpet");
        translationBuilder.add(ModBlocks.GRAY_MOQUETTE_CARPET, "Gray Moquette Carpet");
        translationBuilder.add(ModBlocks.GREEN_MOQUETTE_CARPET, "Green Moquette Carpet");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_MOQUETTE_CARPET, "Light Blue Moquette Carpet");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_MOQUETTE_CARPET, "Light Gray Moquette Carpet");
        translationBuilder.add(ModBlocks.LIME_MOQUETTE_CARPET, "Lime Moquette Carpet");
        translationBuilder.add(ModBlocks.MAGENTA_MOQUETTE_CARPET, "Magenta Moquette Carpet");
        translationBuilder.add(ModBlocks.ORANGE_MOQUETTE_CARPET, "Orange Moquette Carpet");
        translationBuilder.add(ModBlocks.PINK_MOQUETTE_CARPET, "Pink Moquette Carpet");
        translationBuilder.add(ModBlocks.PURPLE_MOQUETTE_CARPET, "Purple Moquette Carpet");
        translationBuilder.add(ModBlocks.WHITE_MOQUETTE_CARPET, "White Moquette Carpet");
        translationBuilder.add(ModBlocks.YELLOW_MOQUETTE_CARPET, "Yellow Moquette Carpet");
    }
}
