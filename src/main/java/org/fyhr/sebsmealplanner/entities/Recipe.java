package org.fyhr.sebsmealplanner.entities;


import jakarta.persistence.*;
import org.fyhr.sebsmealplanner.enums.Measurement;

import java.util.List;

@Entity
@Table(name="recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="recipe_id")
    private int recipeId;


    @Column(name="recipe_name")
    private String recipeName;

    @Column(name="description")
    private String description;

    @OneToMany
    @JoinColumn(name="category_name")
    private List<Category> category;

    @Column(name="portions")
    private int portions;

    @OneToMany
    @JoinColumn(name="instruction")
    private List<Instruction> instruction;

    @OneToMany(cascade = CascadeType.DETACH)
    @JoinColumn(name="ingredient_name")
    private List<Ingredient> ingredient;

    @Column(name="ingredient_amount")
    private double ingredientAmount;

    @Column(name="ingredient_amount_meassurement")
    private Measurement ingredientAmountMeasurement;

    public Recipe() {
    }

    public Recipe(int recipeId, String recipeName, String description, List<Category> category, int portions, List<Instruction> instruction, List<Ingredient> ingredient, double ingredientAmount, Measurement ingredientAmountMeasurement) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.description = description;
        this.category = category;
        this.portions = portions;
        this.instruction = instruction;
        this.ingredient = ingredient;
        this.ingredientAmount = ingredientAmount;
        this.ingredientAmountMeasurement = ingredientAmountMeasurement;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public int getPortions() {
        return portions;
    }

    public void setPortions(int portions) {
        this.portions = portions;
    }

    public List<Instruction> getInstruction() {
        return instruction;
    }

    public void setInstruction(List<Instruction> instruction) {
        this.instruction = instruction;
    }

    public List<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }

    public double getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(double ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public Measurement getIngredientAmountMeasurement() {
        return ingredientAmountMeasurement;
    }

    public void setIngredientAmountMeasurement(Measurement ingredientAmountMeasurement) {
        this.ingredientAmountMeasurement = ingredientAmountMeasurement;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", recipeName='" + recipeName + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", portions=" + portions +
                ", instruction=" + instruction +
                ", ingredient=" + ingredient +
                ", ingredientAmount=" + ingredientAmount +
                ", ingredientAmountMeasurement=" + ingredientAmountMeasurement +
                '}';
    }
}