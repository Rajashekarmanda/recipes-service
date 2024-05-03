/*
 * 
 * You can use the following import statements
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.recipe;

import java.util.ArrayList;

import com.example.recipe.RecipeService;
import com.example.recipe.Recipe;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {
    RecipeService recipeService = new RecipeService();

    @GetMapping("/recipes")
    public ArrayList<Recipe> getRecipes() {
        return recipeService.getRecipes();
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipeDetails(@PathVariable("recipeId") int recipeId) {
        return recipeService.getRecipeDetails(recipeId);
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

    @PutMapping("recipes/{recipeId}")
    public Recipe updateRecipeDetails(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe) {
        return recipeService.updateRecipeDetails(recipeId, recipe);
    }

    @DeleteMapping("recipes/{recipeId}")
    public void deleteRecipe(@PathVariable("recipeId") int recipeId) {
        recipeService.deleteRecipe(recipeId);
    }

}