package se.lexicon.rajashree.jpaassignment2.Impl;

import se.lexicon.rajashree.jpaassignment2.Entities.Recipe;
import se.lexicon.rajashree.jpaassignment2.Entities.RecipeCategory;
import se.lexicon.rajashree.jpaassignment2.repository.RecipeRepo;

import java.util.List;
import java.util.Optional;

public class RecipeRepoImp implements RecipeRepo {
    @Override
    public List<Recipe> findRecipeByName(String receipeName) {
        return null;
    }

    @Override
    public List<Recipe> findAllRecipes(String receipeIngredeintName) {
        return null;
    }

    @Override
    public List<Recipe> findByNameRecipeCategory(RecipeCategory receipeCategory) {
        return null;
    }

    @Override
    public List<Recipe> findAllRecipes(RecipeCategory receipeCategory) {
        return null;
    }

    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Iterable saveAll(Iterable entities) {
        return null;
    }

    @Override
    public Optional findById(Object o) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Object o) {
        return false;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Iterable findAllById(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Object o) {

    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public void deleteAllById(Iterable iterable) {

    }

    @Override
    public void deleteAll(Iterable entities) {

    }

    @Override
    public void deleteAll() {

    }
}