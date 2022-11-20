package io.github.LingSan_CanMeng.items;

import io.github.LingSan_CanMeng.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemsMain {

    /**
    public static final Item amber = Registry.register(Registry.ITEM,
            new Identifier(Main.MOD_ID, "amber"),
            new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16)
            ));
     **/

    public static final Item amber = registerItem("amber",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16)));

    private static Item registerItem(String itemName, Item item){
        return Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID, itemName), item);
    }

    public static void registerItems(){
        Main.LOGGER.debug(Main.MOD_ID + "正在注册物品");
    }

}
