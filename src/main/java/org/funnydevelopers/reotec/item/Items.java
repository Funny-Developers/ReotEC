package org.funnydevelopers.reotec.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static org.funnydevelopers.reotec.Main.MODID;

public class Items {
    public static final Item TEST = new Item(new FabricItemSettings());

    public static void register() {
        register(TEST, "test_item");
    }

    private static void register(Item item, String path) {
        Registry.register(Registries.ITEM, new Identifier(MODID, path), item);
    }
}
