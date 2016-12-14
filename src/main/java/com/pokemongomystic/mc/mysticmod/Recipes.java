package com.pokemongomystic.mc.mysticmod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
    public static void registerRecipes() {
        // Upcrafting

        // Bronze -> Silver
        GameRegistry.addRecipe(
                new ItemStack(ModItems.silverPokecoin),
                "###", "# #", "###", '#', ModItems.bronzePokecoin
        );

        // Silver -> Gold
        GameRegistry.addRecipe(
                new ItemStack(ModItems.goldPokecoin),
                "###", "# #", "###", '#', ModItems.silverPokecoin
        );

        // Gold -> Platinum
        GameRegistry.addRecipe(
                new ItemStack(ModItems.platinumPokecoin),
                "###", "# #", "###", '#', ModItems.goldPokecoin
        );

        // Downcrafting

        // Platinum -> Gold
        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.goldPokecoin, 8),
                ModItems.platinumPokecoin
        );

        // Gold -> Silver
        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.silverPokecoin, 8),
                ModItems.goldPokecoin
        );

        // Silver -> Bronze
        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.bronzePokecoin, 8),
                ModItems.silverPokecoin
        );

        // Saddle recipe
        GameRegistry.addRecipe(
                new ItemStack(Items.SADDLE, 1),
                "LLL", "I I", "   ", 'L', Items.LEATHER , 'I', Items.IRON_INGOT
        );
    }
}
