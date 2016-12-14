package com.pokemongomystic.mc.mysticmod;

import com.pokemongomystic.mc.mysticmod.item.ItemBronzePokecoin;
import com.pokemongomystic.mc.mysticmod.item.ItemGoldPokecoin;
import com.pokemongomystic.mc.mysticmod.item.ItemPlatinumPokecoin;
import com.pokemongomystic.mc.mysticmod.item.ItemSilverPokecoin;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemBronzePokecoin   bronzePokecoin   = new ItemBronzePokecoin();   // 1
    public static final ItemSilverPokecoin   silverPokecoin   = new ItemSilverPokecoin();   // 8
    public static final ItemGoldPokecoin     goldPokecoin     = new ItemGoldPokecoin();     // 64
    public static final ItemPlatinumPokecoin platinumPokecoin = new ItemPlatinumPokecoin(); // 512

    public static void register() {
        ModItems.registerItem(bronzePokecoin);
        ModItems.registerItem(silverPokecoin);
        ModItems.registerItem(goldPokecoin);
        ModItems.registerItem(platinumPokecoin);
    }

    private static <T extends Item> T registerItem(T item) {
        GameRegistry.register(item);

        if(item instanceof ItemModelProvider) {
            ((ItemModelProvider) item).registerItemModel(item);
        }

        return item;
    }
}
