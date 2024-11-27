package monster.esex.Nedia.datageneration;

import monster.esex.Nedia.Nedia;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Nedia.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NediaDataGenerators {

    @SubscribeEvent
    public static void registerData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeServer(), new NediaRecipeProvider(packOutput));
        generator.addProvider(event.includeClient(), new NediaItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new NediaBlockStateProvider(packOutput, existingFileHelper));

    }
}
