package monster.esex.Nedia.datageneration;

import monster.esex.Nedia.Nedia;
import monster.esex.Nedia.items.NediaItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class NediaItemModelProvider extends ItemModelProvider {

    public NediaItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Nedia.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(NediaItems.AMONG_US_PLUSHIE);
    }

    private ItemModelBuilder basicItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Nedia.MODID,"item/" + item.getId().getPath()));
    }
}
