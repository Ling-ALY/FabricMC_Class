package io.github.LingSan_CanMeng.Blocks;

import io.github.LingSan_CanMeng.ItemGroups.ItemGroupsMain;
import io.github.LingSan_CanMeng.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlocksMain {

    /*private static final Block amberBlock = new Block(FabricBlockSettings.of(Material.METAL));
    public static final Item amberBlockItem = Registry.register(Registry.ITEM,
            new Identifier(Main.MOD_ID, "amberblock"),
            new BlockItem(amberBlock, new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Block amberBlockBlock = Registry.register(Registry.BLOCK,
            new Identifier(Main.MOD_ID, "amberblock"),
            amberBlock);*/

    public static final Block amberBlock = registerBlock("amberblock",
            new Block(FabricBlockSettings.of(Material.METAL)),
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
