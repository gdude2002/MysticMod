package com.pokemongomystic.mc.mysticmod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
    public static void registerRecipes() {
        // region: Upcrafting

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

        // endregion
        // region: Half-coins (creation)

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.silverPokecoinHalf, 1),

                ModItems.bronzePokecoin, ModItems.bronzePokecoin,
                ModItems.bronzePokecoin, ModItems.bronzePokecoin
        );

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.goldPokecoinHalf, 1),

                ModItems.silverPokecoin, ModItems.silverPokecoin,
                ModItems.silverPokecoin, ModItems.silverPokecoin
        );

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.platinumPokecoinHalf, 1),

                ModItems.goldPokecoin, ModItems.goldPokecoin,
                ModItems.goldPokecoin, ModItems.goldPokecoin
        );

        // endregion
        // region: Half-coins (merging)

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.silverPokecoin, 1),

                ModItems.silverPokecoinHalf, ModItems.silverPokecoinHalf
        );

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.goldPokecoin, 1),

                ModItems.goldPokecoinHalf, ModItems.goldPokecoinHalf
        );

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.platinumPokecoin, 1),

                ModItems.platinumPokecoinHalf, ModItems.platinumPokecoinHalf
        );

        // endregion
        // region: Half-coins (breaking)

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.bronzePokecoin, 4),

                ModItems.silverPokecoinHalf
        );

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.silverPokecoin, 4),

                ModItems.goldPokecoinHalf
        );

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.goldPokecoin, 4),

                ModItems.platinumPokecoinHalf
        );

        //region
        // region: Downcrafting

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

        // endregion
        // region: Other recipes

        GameRegistry.addRecipe(
                new ItemStack(Items.SADDLE, 1),
                "LLL", "I I", "   ", 'L', Items.LEATHER , 'I', Items.IRON_INGOT
        );

        // endregion
    }
}
