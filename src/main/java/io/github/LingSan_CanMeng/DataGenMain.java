package io.github.LingSan_CanMeng;

import io.github.LingSan_CanMeng.DataGen.ModBlockLootTableDataGen;
import io.github.LingSan_CanMeng.DataGen.ModBlockTagDataGen;
import io.github.LingSan_CanMeng.DataGen.ModModelDataGen;
import io.github.LingSan_CanMeng.DataGen.ModRecipeDataGen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenMain implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(ModBlockLootTableDataGen::new);
        fabricDataGenerator.addProvider(ModModelDataGen::new);
        fabricDataGenerator.addProvider(ModRecipeDataGen::new);
        fabricDataGenerator.addProvider(ModBlockTagDataGen::new);
    }
}
