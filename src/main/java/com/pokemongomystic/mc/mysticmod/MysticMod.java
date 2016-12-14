package com.pokemongomystic.mc.mysticmod;

import com.pokemongomystic.mc.mysticmod.common.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = MysticMod.MODID, version = MysticMod.VERSION)
public class MysticMod {
    public static final String MODID = "mysticmod";
    public static final String VERSION = "0.0.1";
    public static final CreativeTabs creativeTab = new MysticCreativeTab();

    @SidedProxy(serverSide = "com.pokemongomystic.mc.mysticmod.server.ServerProxy", clientSide = "com.pokemongomystic.mc.mysticmod.client.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MysticMod.MODID)
    public static MysticMod instance;

    private final Logger logger = LogManager.getLogger(MODID);

    @Mod.EventHandler
    public void pre_init(FMLPreInitializationEvent event) {
        ModItems.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        Recipes.registerRecipes();
        proxy.registerEventHandlers();
    }

    public void logInfo(String message) {
        this.logger.info(message);
    }
}
