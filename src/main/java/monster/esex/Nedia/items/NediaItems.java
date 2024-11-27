package monster.esex.Nedia.items;

import monster.esex.Nedia.Nedia;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NediaItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Nedia.MODID);

    public static final RegistryObject<Item> ITEM1 = ITEMS.register("item1",
            () -> new Item(new Item.Properties().stacksTo(64)));

}
