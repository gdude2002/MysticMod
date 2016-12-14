package com.pokemongomystic.mc.mysticmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MysticCreativeTab extends CreativeTabs {
    public MysticCreativeTab() {
        super(MysticMod.MODID);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.goldPokecoin;
    }

    @Override
    public boolean hasSearchBar() {
        return false;
    }
}
