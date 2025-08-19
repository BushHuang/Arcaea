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
    public static final Item RUBBER = registerItem("rubber", new Item(new Item.Settings()));
    public static final Item CD_EMPTY = registerItem("cd_empty", new Item(new Item.Settings()));
    public static final Item ARCAEA_STICK = registerItem("arcaea_stick", new Item(new Item.Settings()));
    public static final Item IRON_PLATE = registerItem("iron_plate", new Item(new Item.Settings()));
    public static final Item CIRCUIT_BOARD = registerItem("circuit_board", new Item(new Item.Settings()));
    public static final Item CIRCUIT_CLOCK = registerItem("circuit_clock", new Item(new Item.Settings()));
    public static final Item CAPACITOR = registerItem("capacitor", new Item(new Item.Settings()));
    public static final Item POINTER = registerItem("pointer", new Item(new Item.Settings()));
    public static final Item HEAT_SINK = registerItem("heat_sink", new Item(new Item.Settings()));
    public static final Item BATTERY = registerItem("battery", new Item(new Item.Settings()));
    public static final Item ELECTRONIC_CORE = registerItem("electronic_core", new Item(new Item.Settings()));
    public static final Item ESP32 = registerItem("esp32", new Item(new Item.Settings()));
    public static final Item ARCAEA_DIAMOND = registerItem("arcaea_diamond", new Item(new Item.Settings()));
    public static final Item ARCAEA_APPLE = registerItem("arcaea_apple", new Item(new Item.Settings()));

    public static final Item CD_TEMPESTISSIMO = registerItem("cd_tempestissimo", new Item(new Item.Settings()));

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ARCAEARESURRECTION.MOD_ID, id), item);
    }

    public static void registerModItems() {

    }
}
