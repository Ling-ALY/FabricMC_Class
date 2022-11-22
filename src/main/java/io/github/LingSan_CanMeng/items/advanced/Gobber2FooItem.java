package io.github.LingSan_CanMeng.items.advanced;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Gobber2FooItem extends Item {

    public Gobber2FooItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.gobber2_foo"));
        if (Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.shift.gobber2_foo"));
        } else {
            tooltip.add(Text.translatable("tooltip.not_shift.gobber2_foo"));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
