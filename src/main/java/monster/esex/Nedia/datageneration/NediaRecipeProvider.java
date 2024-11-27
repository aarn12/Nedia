package monster.esex.Nedia.datageneration;

import monster.esex.Nedia.items.NediaItems;
import net.minecraft.advancements.CriterionTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.entity.ai.behavior.declarative.Trigger;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class NediaRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public NediaRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }



    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
    }
}
