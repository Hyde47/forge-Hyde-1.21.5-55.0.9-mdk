package net.irena.examplemod.item;

import net.irena.examplemod.ExampleMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);


    public static final RegistryObject<Item> RAMI = ITEMS.register("rami",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse(ExampleMod.MOD_ID + ":rami")))
            ));


    public static void register(IEventBus eventBus) {
        // Register all items
        ITEMS.register(eventBus);
    }
}


