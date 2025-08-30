package kiritossword;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// Main mod class. The modId here must match your mods.toml
@Mod(KiritosSword.MODID)
public final class KiritosSword {
    public static final String MODID = "kiritossword";
    private static final Logger LOGGER = LogUtils.getLogger();

    // Register items for this mod
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // Set up a registry for creative mode tabs in this mod
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Register the KiritosSword item
    public static final RegistryObject<Item> KIRITOS_SWORD = ITEMS.register("kiritossword",
            () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("kiritossword")
                    )
            )
    );

    // Register a custom creative mode tab for this mod
    public static final RegistryObject<CreativeModeTab> KIRITOS_TAB = CREATIVE_MODE_TABS.register("kiritostab",
            () -> CreativeModeTab.builder()
                    .icon(() -> KIRITOS_SWORD.get().getDefaultInstance())
                    .title(Component.literal("Kirito Sword Item"))
                    .displayItems((parameters, output) -> {
                        output.accept(KIRITOS_SWORD.get());
                    })
                    .build());

    public KiritosSword(FMLJavaModLoadingContext context) {
        // Register items to the mod event bus
        ITEMS.register(context.getModBusGroup());
        CREATIVE_MODE_TABS.register(context.getModBusGroup());
        LOGGER.info("KiritosSword mod loaded!");
    }
}
