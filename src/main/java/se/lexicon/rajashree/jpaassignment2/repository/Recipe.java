package se.lexicon.rajashree.jpaassignment2.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Recipe extends CrudRepository{
    List<Recipe> findByName(String name);

}
