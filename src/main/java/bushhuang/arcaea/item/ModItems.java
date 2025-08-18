package bushhuang.arcaea.item;

import bushhuang.arcaea.ARCAEARESURRECTION;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ARCAEA_INGOT = registerItem("arcaea_ingot", new Item(new Item.Settings()));
    public static final Item ARCAEA_NUGGET = registerItem("arcaea_nugget", new Item(new Item.Settings()));
    public static final Item ETHER_DROP = registerItem("ether_drop", new Item(new Item.Settings()));
    public static final Item NOTALIUM = registerItem("notalium", new Item(new Item.Settings()));
    public static final Item FRAGMENT = registerItem("fragment", new Item(new Item.Settings()));
    public static final Item CD_TEMPESTISSIMO = registerItem("cd_tempestissimo", new Item(new Item.Settings()));

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ARCAEARESURRECTION.MOD_ID, id), item);
    }

    public static void registerModItems() {

    }
}
