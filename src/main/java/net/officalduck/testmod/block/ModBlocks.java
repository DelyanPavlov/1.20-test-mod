package net.officalduck.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.officalduck.testmod.TestMod;

public class ModBlocks {

    public static final Block CREATE = registerBlocks("crate", new Block(FabricBlockSettings.copyOf(Blocks.BARREL)));

    public static Block registerBlocks(String name,Block block)
    {
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    public static Item RegisterBlockItem (String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBloks()
    {
        TestMod.LOGGER.info("registering bloks for" + TestMod.MOD_ID);
    }
}
