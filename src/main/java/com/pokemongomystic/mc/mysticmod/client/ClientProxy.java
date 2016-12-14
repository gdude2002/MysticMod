package com.pokemongomystic.mc.mysticmod.client;

import com.pokemongomystic.mc.mysticmod.MysticMod;
import com.pokemongomystic.mc.mysticmod.common.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy implements CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(MysticMod.MODID + ":" + id, "inventory"));
    }

    @Override
    public void registerEventHandlers() {

    }
}
