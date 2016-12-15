package com.pokemongomystic.mc.mysticmod;

import com.pokemongomystic.mc.mysticmod.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemBronzePokecoin   bronzePokecoin           = new ItemBronzePokecoin();        // 1
    public static final ItemSilverPokecoin   silverPokecoin           = new ItemSilverPokecoin();        // 8
    public static final ItemGoldPokecoin     goldPokecoin             = new ItemGoldPokecoin();          // 64
    public static final ItemPlatinumPokecoin platinumPokecoin         = new ItemPlatinumPokecoin();      // 512

    public static final ItemSilverPokecoinHalf   silverPokecoinHalf   = new ItemSilverPokecoinHalf();    // 4
    public static final ItemGoldPokecoinHalf     goldPokecoinHalf     = new ItemGoldPokecoinHalf();      // 32
    public static final ItemPlatinumPokecoinHalf platinumPokecoinHalf = new ItemPlatinumPokecoinHalf();  // 256

    public static void register() {
        ModItems.registerItem(bronzePokecoin);
        ModItems.registerItem(silverPokecoin);
        ModItems.registerItem(goldPokecoin);
        ModItems.registerItem(platinumPokecoin);

        ModItems.registerItem(silverPokecoinHalf);
        ModItems.registerItem(goldPokecoinHalf);
        ModItems.registerItem(platinumPokecoinHalf);
    }

    private static <T extends Item> T registerItem(T item) {
        GameRegistry.register(item);

        if(item instanceof ItemModelProvider) {
            ((ItemModelProvider) item).registerItemModel(item);
        }

        return item;
    }
}
