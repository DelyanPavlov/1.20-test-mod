package net.officalduck.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.officalduck.testmod.TestMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.officalduck.testmod.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID, "coconut"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.coconut"))
                    .icon(() -> new ItemStack(ModItems.COCONUT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COCONUT);
                        entries.add(ModItems.COCONUT_MILK);

                        entries.add(ModBlocks.CREATE);

                    }).build());

    public static void registerItemGroups()
    {
        TestMod.LOGGER.info("Registering item groups for" + TestMod.MOD_ID);
    }
}