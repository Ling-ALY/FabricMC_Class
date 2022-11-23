package io.github.LingSan_CanMeng.DataGen;

import io.github.LingSan_CanMeng.Blocks.ModBlocksMain;
import io.github.LingSan_CanMeng.Main;
import io.github.LingSan_CanMeng.Items.ModItemsMain;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ModBlockLootTableDataGen extends SimpleFabricLootTableProvider {

    public ModBlockLootTableDataGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(new Identifier(Main.MOD_ID, "blocks/zinc_block"),
                BlockLootTableGenerator.drops(ModBlocksMain.zincBlock));

        identifierBuilderBiConsumer.accept(new Identifier(Main.MOD_ID, "blocks/zinc_ore"),
                BlockLootTableGenerator.oreDrops(ModBlocksMain.zincOre, ModItemsMain.rawZinc));

        identifierBuilderBiConsumer.accept(new Identifier(Main.MOD_ID, "blocks/deepslate_zinc_ore"),
                BlockLootTableGenerator.dropsWithSilkTouch(ModBlocksMain.deepslateZincOre,
                        (LootPoolEntry.Builder)BlockLootTableGenerator.applyExplosionDecay(ModBlocksMain.deepslateZincOre,
                                ((LeafEntry.Builder) ItemEntry
                                        .builder(ModItemsMain.rawZinc)
                                        .apply(SetCountLootFunction
                                                .builder(UniformLootNumberProvider
                                                        .create(1.0f, 2.0f))))
                                        .apply(ApplyBonusLootFunction
                                                .oreDrops(Enchantments.FORTUNE)))));
    }
}
