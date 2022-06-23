package se.lexicon.rajashree.jpaassignment2.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.rajashree.jpaassignment2.Entities.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientRepo extends CrudRepository {

    Optional<Ingredient> findByIngredientName(String ingredientName);
    List<Ingredient> findAllIngredients(String ingredientName);
}
