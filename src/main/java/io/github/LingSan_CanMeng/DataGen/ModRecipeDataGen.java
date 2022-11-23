package io.github.LingSan_CanMeng.DataGen;

import io.github.LingSan_CanMeng.Blocks.ModBlocksMain;
import io.github.LingSan_CanMeng.Items.ModItemsMain;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeDataGen extends FabricRecipeProvider {
    public ModRecipeDataGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter,
                List.of(ModItemsMain.rawZinc,ModBlocksMain.zincOre, ModBlocksMain.deepslateZincOre),
                ModItemsMain.zincIngot, 1f, 200, "zinc_ingot");
        offerBlasting(exporter,
                List.of(ModItemsMain.rawZinc,ModBlocksMain.zincOre, ModBlocksMain.deepslateZincOre),
                ModItemsMain.zincIngot, 1f, 100, "zinc_ingot");

        offerReversibleCompactingRecipes(exporter, ModItemsMain.zincIngot, ModBlocksMain.zincBlock,
                "zinc_block_from_zinc_ingot", null,
                "zinc_ingot_from_zinc_block", null);
        offerReversibleCompactingRecipes(exporter, ModItemsMain.zincNugget, ModItemsMain.zincIngot,
                "zinc_ingot_from_zinc_nugget", null,
                "zinc_nugget_from_zinc_ingot", null);

        ShapedRecipeJsonBuilder.create(ModItemsMain.gobber2Foo)
                .pattern("ABB")
                .pattern("BBB")
                .pattern("BBB")
                .input('A', ModBlocksMain.zincBlock)
                .input('B', Items.COAL)
                .criterion(RecipeProvider.hasItem(ModBlocksMain.zincBlock),
                        RecipeProvider.conditionsFromItem(ModBlocksMain.zincBlock))
                .criterion(RecipeProvider.hasItem(Items.COAL),
                        RecipeProvider.conditionsFromItem(Items.COAL))
                .offerTo(exporter);
    }
}
