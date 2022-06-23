package se.lexicon.rajashree.jpaassignment2.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.rajashree.jpaassignment2.Entities.Recipe;
import se.lexicon.rajashree.jpaassignment2.Entities.RecipeInstruction;

public interface RecipeInstructionRepo extends CrudRepository {

    RecipeInstruction getRecipeInstruction(int receipeId);
    void deleteReceipeInstruction(int receipeId);
    RecipeInstruction saveRecipeInstruction(Recipe recipe);
    RecipeInstruction updateInstruction(Recipe recipe);
}
