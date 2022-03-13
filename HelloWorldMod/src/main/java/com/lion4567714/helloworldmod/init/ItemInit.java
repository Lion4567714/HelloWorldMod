package com.lion4567714.helloworldmod.init;

import com.lion4567714.helloworldmod.HelloWorldMod;
import com.google.common.base.Supplier;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HelloWorldMod.MOD_ID);

    public static final RegistryObject<Item> POGGERS_ITEM = ITEMS.register("poggers_item", () -> new Item(new Item.Properties().tab(HelloWorldMod.HELLO_WORLD_TAB)));
    public static final RegistryObject<Item> BANANA_ITEM = ITEMS.register("banana", () -> new Item(new Item.Properties().tab(HelloWorldMod.HELLO_WORLD_TAB)));

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }

}
