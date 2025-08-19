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
                        entries.add(ModItems.ARCAEA_DIAMOND);
                        entries.add(ModItems.ARCAEA_STICK);
                        entries.add(ModItems.ARCAEA_APPLE);
                        entries.add(ModItems.FRAGMENT);
                        entries.add(ModItems.ETHER_DROP);
                        entries.add(ModItems.CD_EMPTY);
                        entries.add(ModItems.CD_TEMPESTISSIMO);
                        entries.add(ModItems.BATTERY);
                        entries.add(ModItems.CAPACITOR);
                        entries.add(ModItems.CIRCUIT_BOARD);
                        entries.add(ModItems.CIRCUIT_CLOCK);
                        entries.add(ModItems.ELECTRONIC_CORE);
                        entries.add(ModItems.HEAT_SINK);
                        entries.add(ModItems.IRON_PLATE);
                        entries.add(ModItems.POINTER);
                        entries.add(ModItems.RUBBER);
                        entries.add(ModItems.ESP32);
                    }).build());
    public static void registerModGroups() {

    }
}
