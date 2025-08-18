package bushhuang.arcaea.item;

import bushhuang.arcaea.ARCAEARESURRECTION;
import bushhuang.arcaea.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ARCAEA_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(ARCAEARESURRECTION.MOD_ID, "arcaea_group"),
            ItemGroup.create(null, -1)
                    .displayName(Text.translatable("itemGroup.arcaea_group"))
                    .icon(() -> new ItemStack(ModItems.ARCAEA_INGOT))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.NOTALIUM_ORE);
                        entries.add(ModItems.NOTALIUM);
                        entries.add(ModBlocks.NOTALIUM_BLOCK);
                        entries.add(ModItems.ARCAEA_INGOT);
                        entries.add(ModItems.ARCAEA_NUGGET);
                        entries.add(ModBlocks.ARCAEA_BLOCK);
                        entries.add(ModItems.FRAGMENT);
                        entries.add(ModItems.ETHER_DROP);
                        entries.add(ModItems.CD_TEMPESTISSIMO);
                    }).build());
    public static void registerModGroups() {

    }
}
