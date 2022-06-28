package se.lexicon.rajashree.jpaassignment2.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.rajashree.jpaassignment2.Entities.RecipeCategory;

public interface RecipeCategoryRepo extends CrudRepository<RecipeCategory,Integer> {
}
