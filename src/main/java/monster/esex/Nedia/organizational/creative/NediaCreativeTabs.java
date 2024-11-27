package monster.esex.Nedia.organizational.creative;

import monster.esex.Nedia.Nedia;
import monster.esex.Nedia.items.NediaItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class NediaCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Nedia.MODID);

    public static void registerTabs(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

    public static final RegistryObject<CreativeModeTab> FUN_TAB = CREATIVE_MODE_TABS.register("fun_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NediaItems.AMONG_US_PLUSHIE.get()))
                    .title(Component.translatable("creativetab.fun_tab"))
                    .displayItems((pParameters, output) -> {
                        output.accept(NediaItems.AMONG_US_PLUSHIE.get());
                        output.accept(NediaItems.C_AMONG_US_PLUSHIES.get());
                    })
                    .build());

}
