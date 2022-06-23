package se.lexicon.rajashree.jpaassignment2.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.rajashree.jpaassignment2.Entities.Recipe;
import se.lexicon.rajashree.jpaassignment2.Entities.RecipeCategory;

import java.util.List;

public interface RecipeRepo extends CrudRepository{
    List<Recipe> findRecipeByName(String receipeName);
    List<Recipe> findAllRecipes(String receipeIngredeintName);
    List<Recipe> findByNameRecipeCategory(RecipeCategory receipeCategory);
    List<Recipe> findAllRecipes(RecipeCategory receipeCategory);

}
