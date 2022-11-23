package io.github.LingSan_CanMeng.Items;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModItemsFuelRegistry {

    public static void registerFuel(){
        FuelRegistry.INSTANCE.add(ModItemsMain.gobber2Foo, 64000);
    }

}
