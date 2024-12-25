package org.zombie.potionstacker;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Potionstacker.MODID)
public class Potionstacker
{
    public static final String MODID = "potionstacker";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Potionstacker(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Hello from Potion Stacker !");
    }

}
