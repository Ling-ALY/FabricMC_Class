package io.github.LingSan_CanMeng.DataGen;

import io.github.LingSan_CanMeng.Blocks.ModBlocksMain;
import io.github.LingSan_CanMeng.items.ModItemsMain;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelDataGen extends FabricModelProvider {
    public ModModelDataGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocksMain.zincBlock);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocksMain.zincOre);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocksMain.deepslateZincOre);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItemsMain.zincIngot, Models.GENERATED);
        itemModelGenerator.register(ModItemsMain.zincNugget, Models.GENERATED);
        itemModelGenerator.register(ModItemsMain.rawZinc, Models.GENERATED);
        itemModelGenerator.register(ModItemsMain.gobber2Foo, Models.GENERATED);
    }
}
