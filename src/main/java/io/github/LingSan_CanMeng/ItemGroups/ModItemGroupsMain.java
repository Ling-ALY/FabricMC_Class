package io.github.LingSan_CanMeng.ItemGroups;

import io.github.LingSan_CanMeng.Main;
import io.github.LingSan_CanMeng.items.ModItemsMain;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroupsMain {

    public static final ItemGroup lscm = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "lscm"),
            () -> new ItemStack(ModItemsMain.zincIngot));

}
