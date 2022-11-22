package io.github.LingSan_CanMeng.Blocks;

import io.github.LingSan_CanMeng.ItemGroups.ItemGroupsMain;
import io.github.LingSan_CanMeng.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class BlocksMain {

    public static final Block zincBlock = registerBlock("zinc_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f)),
            ItemGroupsMain.lscm);
    public static final Block zincOre = registerBlock("zinc_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3f),
                    UniformIntProvider.create(1,2)),
            ItemGroupsMain.lscm);
    public static final Block deepslateZincOre = registerBlock("deepslate_zinc_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.DEEPSLATE).requiresTool().strength(4.5f),
                    UniformIntProvider.create(2,3)),
            ItemGroupsMain.lscm);

    public static Block registerBlock(String blockName,Block block, ItemGroup itemGroup){
        Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID, blockName),
                new BlockItem(block, new FabricItemSettings().group(itemGroup)));
        return Registry.register(Registry.BLOCK,
                new Identifier(Main.MOD_ID, blockName),
                block);
    }

    public static void registerBlocks(){
        Main.LOGGER.debug(Main.MOD_ID + "正在注册方块");
    }

}
