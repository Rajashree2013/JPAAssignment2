package se.lexicon.rajashree.jpaassignment2.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import se.lexicon.rajashree.jpaassignment2.Entities.Ingredient;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IngredientRepoTest {

    @Autowired
    private IngredientRepo testObject;

    @BeforeEach
    public void setup() {
        testObject.save(new Ingredient("Crud"));
    }

    @Test
    public void given_findByIngredientName() {
        Ingredient expectedContent = new Ingredient("Crud");
        Optional<Ingredient> result = testObject.findByIngredientName("Crud");
        assertTrue(result.isPresent());
        assertEquals(expectedContent, result.get());
    }
}
