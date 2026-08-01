package bloodclover.cdgbiodiesel;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CDGBiodiesel.MODID)
public class CDGBiodiesel {
    public static final String MODID = "cdgbiodiesel";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CDGBiodiesel(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
    }

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("cdgbiodiesel");

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO SAID THE COMMON SETUP, and uhh.. I guess CDG: BioDiesel is loaded?");
    }
}
