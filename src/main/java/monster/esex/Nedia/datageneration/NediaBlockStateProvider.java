package monster.esex.Nedia.datageneration;

import monster.esex.Nedia.Nedia;
import monster.esex.Nedia.blocks.NediaBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class NediaBlockStateProvider extends BlockStateProvider {

    public NediaBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Nedia.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockItem(NediaBlocks.CONDENSED_AMONG_US_PLUSHIE);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
