package se.lexicon.rajashree.jpaassignment2.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.rajashree.jpaassignment2.Entities.Recipe;
import se.lexicon.rajashree.jpaassignment2.Entities.RecipeCategory;

import java.util.List;

public interface RecipeRepo extends CrudRepository<Recipe,Integer> {
    List<Recipe> findRecipeByNameContains(String receipeName);
    List<Recipe> findAllRecipesContains(String receipeIngredeintName);
    List<Recipe> findByNameRecipeCategory(RecipeCategory receipeCategory);
    List<Recipe> findAllRecipesMatchOneOrMoreCategory(RecipeCategory receipeCategory);

}
