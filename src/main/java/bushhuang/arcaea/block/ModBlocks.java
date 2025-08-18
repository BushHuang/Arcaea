package bushhuang.arcaea.block;

import bushhuang.arcaea.ARCAEARESURRECTION;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block NOTALIUM_ORE = register("notalium_ore", new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block NOTALIUM_BLOCK = register("notalium_block", new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block ARCAEA_BLOCK = register("arcaea_block", new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));


    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(ARCAEARESURRECTION.MOD_ID, id), block);
    }

    public static void registerBlockItems(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(ARCAEARESURRECTION.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

    }

}
