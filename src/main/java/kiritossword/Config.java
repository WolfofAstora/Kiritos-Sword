package kiritossword;

import net.minecraftforge.common.ForgeConfigSpec;

// Example config class for your mod
public class Config {
    // Builder for config options
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    // Example config option: enable the sword
    public static final ForgeConfigSpec.BooleanValue ENABLE_SWORD = BUILDER
            .comment("Enable or disable the KiritosSword item.")
            .define("enableSword", true);

    // Build the config spec
    public static final ForgeConfigSpec SPEC = BUILDER.build();
}
