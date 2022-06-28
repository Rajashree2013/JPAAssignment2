package se.lexicon.rajashree.jpaassignment2.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.rajashree.jpaassignment2.Entities.Recipe;
import se.lexicon.rajashree.jpaassignment2.Entities.RecipeCategory;

import java.util.List;

public interface RecipeRepo extends CrudRepository<Recipe,Integer> {
    //Search for recipes where recipe name contains specified String.
    List<Recipe> findByRecipeNameContaining(String name);

    List<Recipe> findAllRecipesContains(String receipeIngredeintName);


    //Search for all recipes that belong to a specific recipe category
    List<Recipe> findRecipesByCategoryName(String categoryName);

    //Search for all recipes that match one or more categories
    List<Recipe> findAllRecipesMatchOneOrMoreCategory(RecipeCategory receipeCategory);

}
