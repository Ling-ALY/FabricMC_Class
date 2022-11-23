package io.github.LingSan_CanMeng.DataGen;

import io.github.LingSan_CanMeng.Blocks.ModBlocksMain;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockTagDataGen extends FabricTagProvider<Block> {
    public ModBlockTagDataGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft", "needs_iron_tool")))
                .add(ModBlocksMain.zincBlock)
                .add(ModBlocksMain.zincOre)
                .add(ModBlocksMain.deepslateZincOre);
        getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft", "mineable/pickaxe")))
                .add(ModBlocksMain.zincBlock)
                .add(ModBlocksMain.zincOre)
                .add(ModBlocksMain.deepslateZincOre);
    }
}
