package com.pokemongomystic.mc.mysticmod.common;

import net.minecraft.item.Item;

public interface CommonProxy {
    void registerItemRenderer(Item item, int meta, String id);
    void registerEventHandlers();
}
