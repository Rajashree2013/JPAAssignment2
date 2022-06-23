package se.lexicon.rajashree.jpaassignment2.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Recipe {

    //todo:fix int type string
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 100)
    private String recipeName;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            mappedBy = "recipe",
            orphanRemoval = true
    )
    private List<RecipeIngredient> recipeIngredients;

    @OneToOne(mappedBy = "recipe")
    private RecipeInstruction instruction;

    @ManyToMany
    @JoinTable(name = "receipecategory_receipe",
            joinColumns = @JoinColumn(name = "receipecategory_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id")
    )
    private Set<RecipeCategory> categories;

    public Recipe() {
    }

    public Recipe(String recipeName, List<RecipeIngredient> recipeIngredients, RecipeInstruction instruction, Set<RecipeCategory> categories) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.instruction = instruction;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<RecipeIngredient> getRecipeIngredients() {
        if (recipeIngredients == null) recipeIngredients = new ArrayList<>();
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public RecipeInstruction getInstruction() {
        return instruction;
    }

    public void setInstruction(RecipeInstruction instruction) {
        this.instruction = instruction;
    }

    public Set<RecipeCategory> getCategories() {
        return categories;
    }

    public void setCategories(Set<RecipeCategory> categories) {
        this.categories = categories;
    }


    public void addReceipeIngredient(RecipeIngredient receipeIngredient){
        if (receipeIngredient == null) throw new IllegalArgumentException("receipeIngredient data is null");
        if (receipeIngredient == null) recipeIngredients = new ArrayList<>();
        if (!recipeIngredients.contains(receipeIngredient)) recipeIngredients.add(receipeIngredient);
    }
    public void removeReceipeIngredient(RecipeIngredient receipeIngredient) {

        if (receipeIngredient == null) throw new IllegalArgumentException("recipeIngredient data is null");
        if (receipeIngredient == null) recipeIngredients = new ArrayList<>();

        ;
        recipeIngredients.remove(receipeIngredient);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return getId() == recipe.getId() && getRecipeName().equals(recipe.getRecipeName()) && getRecipeIngredients().equals(recipe.getRecipeIngredients()) && getInstruction().equals(recipe.getInstruction()) && getCategories().equals(recipe.getCategories());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRecipeName(), getRecipeIngredients(), getInstruction(), getCategories());
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeName='" + recipeName + '\'' +
                ", recipeIngredients=" + recipeIngredients +
                ", instruction=" + instruction +
                ", categories=" + categories +
                '}';
    }





}
