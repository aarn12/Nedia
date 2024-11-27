package monster.esex.Nedia.items;

import monster.esex.Nedia.Nedia;
import monster.esex.Nedia.blocks.NediaBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.macosx.CGEventTapCallBack;

public class NediaItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Nedia.MODID);

    public static void registerItems(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final RegistryObject<Item> AMONG_US_PLUSHIE = ITEMS.register("among_us_plushie",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<BlockItem> C_AMONG_US_PLUSHIES = ITEMS.register("c_among_us_plushies",
            () -> new BlockItem(NediaBlocks.CONDENSED_AMONG_US_PLUSHIE.get(), new Item.Properties()));

}
