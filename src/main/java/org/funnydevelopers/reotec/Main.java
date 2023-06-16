package org.funnydevelopers.reotec;

import net.fabricmc.api.ModInitializer;
import org.funnydevelopers.reotec.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
    public static final String MODID = "dreambacktobianjing";
    public static final Logger LOGGER = LoggerFactory.getLogger("dreambacktobianjing");

    @Override
    public void onInitialize() {
        LOGGER.info("Welcome to use our mod!");
        Items.register();
    }
}
