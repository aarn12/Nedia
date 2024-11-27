package monster.esex.Nedia.blocks;

import monster.esex.Nedia.Nedia;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NediaBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Nedia.MODID);

    public static void registerBlocks(IEventBus bus) {
        BLOCKS.register(bus);
    }

    public static final RegistryObject<Block> CONDENSED_AMONG_US_PLUSHIE = BLOCKS.register("c_among_us_plushies",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).sound(SoundType.LILY_PAD)));
}
