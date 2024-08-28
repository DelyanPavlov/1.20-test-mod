package net.officalduck.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.officalduck.testmod.TestMod;

public class ModItems {

    public static final Item COCONUT = registerItem("coconut", new Item(new FabricItemSettings()));
    public static final Item COCONUT_MILK = registerItem("coconut_milk", new Item(new FabricItemSettings()));

    private  static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(COCONUT);
        entries.add(COCONUT_MILK);
    }

    private  static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name), item);

    }

    public static  void registerModItems()
    {
        TestMod.LOGGER.info("Registering mod items for" + TestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
    }
}
