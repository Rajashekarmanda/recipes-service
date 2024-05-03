// Write your code here
package com.example.recipe;

import java.util.ArrayList;

import com.example.recipe.*;

public interface RecipeRepository {
    ArrayList<Recipe> getRecipes();

    Recipe getRecipeDetails(int recipeId);

    Recipe addRecipe(Recipe recipe);

    Recipe updateRecipeDetails(int recipeId, Recipe recipe);

    void deleteRecipe(int recipeId);
}