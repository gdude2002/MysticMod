package com.pokemongomystic.mc.mysticmod.item;

import com.pokemongomystic.mc.mysticmod.ItemModelProvider;
import com.pokemongomystic.mc.mysticmod.MysticMod;
import net.minecraft.item.Item;

public abstract class BasePokecoin extends Item implements ItemModelProvider {
    public final String name;

    public BasePokecoin(String name) {
        this.name = name;
        this.setUnlocalizedName(this.name);
        this.setHasSubtypes(false);
        this.setMaxStackSize(64);
        this.setCreativeTab(MysticMod.creativeTab);
        this.setRegistryName(this.name);
    }

    @Override
    public void registerItemModel(Item item) {
        MysticMod.proxy.registerItemRenderer(this, 0, this.name);
    }
}
