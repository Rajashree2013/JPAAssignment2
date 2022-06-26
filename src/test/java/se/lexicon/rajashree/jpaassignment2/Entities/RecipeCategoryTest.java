package se.lexicon.rajashree.jpaassignment2.Entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecipeCategoryTest {
    private RecipeCategory recipeCategory;

    @BeforeEach
    private void setup() {

        Ingredient ingredient = new Ingredient("Oil");
        RecipeIngredient recipeIngredient = new RecipeIngredient();
        RecipeInstruction recipeInstruction = new RecipeInstruction("Prepare");
        ArrayList<RecipeIngredient> recipeIngredients = new ArrayList<>();


    }


}
