package com.infrastructuresickos.mob_gear_scaling;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mob_gear_scaling")
public class MobGearScaling {
    public static final Logger LOGGER = LogManager.getLogger();

    public MobGearScaling() {
        LOGGER.info("MobGearScaling mod initialized");
    }
}
