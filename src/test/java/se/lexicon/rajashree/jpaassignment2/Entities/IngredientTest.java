package se.lexicon.rajashree.jpaassignment2.Entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IngredientTest {

    private Ingredient ingredient;

    @BeforeEach
    private void setup() {
        ingredient = new Ingredient(1, "Curd");
    }

    @Test
    public void testObject_successfully_created() {
        assertEquals(1, ingredient.getId());
        assertEquals("Curd", ingredient.getIngredientName());
    }

    @Test
    public void test_equal_and_hashcode_true() {
        Ingredient copy = new Ingredient(1, "Curd");
        assertEquals(copy, ingredient);
        assertEquals(copy.hashCode(), ingredient.hashCode());
    }

    @Test
    public void test_toString_contains(){
        String toString = ingredient.toString();

        assertTrue(
                toString.contains("1") &&
                        toString.contains("Curd"));
    }


}
