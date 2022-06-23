package se.lexicon.rajashree.jpaassignment2.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.rajashree.jpaassignment2.Entities.Recipe;
import se.lexicon.rajashree.jpaassignment2.Entities.RecipeIngredient;

public interface RecipeIngredientRepo extends CrudRepository {
    RecipeIngredient getRecipeIngredient(int receipeId);
    void deleteRecipeIngredient(int receipeId);
    RecipeIngredient saveRecipe(Recipe recipe);
    RecipeIngredient update(Recipe recipe);

}
