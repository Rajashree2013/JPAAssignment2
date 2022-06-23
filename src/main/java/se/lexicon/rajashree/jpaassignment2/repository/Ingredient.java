package se.lexicon.rajashree.jpaassignment2.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface Ingredient extends CrudRepository {

    Optional<Ingredient> findByName(String name);

    List<Ingredient> findByIngName(String name);
}
