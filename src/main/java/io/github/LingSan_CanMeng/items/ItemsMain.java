package io.github.LingSan_CanMeng.items;

import io.github.LingSan_CanMeng.ItemGroups.ItemGroupsMain;
import io.github.LingSan_CanMeng.Main;
import io.github.LingSan_CanMeng.items.advanced.Gobber2FooItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemsMain {

    public static final Item zincIngot = registerItem("zinc_ingot",
            new Item(new FabricItemSettings().group(ItemGroupsMain.lscm)));
    public static final Item zincNugget = registerItem("zinc_nugget",
            new Item(new FabricItemSettings().group(ItemGroupsMain.lscm)));
    public static final Item rawZinc = registerItem("raw_zinc",
            new Item(new FabricItemSettings().group(ItemGroupsMain.lscm)));
    public static final Item gobber2Foo = registerItem("gobber2_foo",
            new Gobber2FooItem(new FabricItemSettings().group(ItemGroupsMain.lscm)));

    private static Item registerItem(String itemName, Item item){
        return Registry.register(Registry.ITEM,
                new Identifier(Main.MOD_ID, itemName), item);
    }

    public static void registerItems(){
        Main.LOGGER.debug(Main.MOD_ID + "正在注册物品");
    }

}
