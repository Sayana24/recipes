package com.taraskina.top.recipes.repository;

import com.taraskina.top.recipes.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryRecipeDAO {
    private final List<Recipe> RECIPES = new ArrayList<>();
    public List<Recipe> findAllRecipe() {
        return RECIPES;
    }
    public Recipe saveRecipe(Recipe recipe) {
        RECIPES.add(recipe);
        return recipe;
    }
    public Recipe findByName(String name) {
        return RECIPES.stream()
                .filter(element ->element.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
    public Recipe updateRecipe(Recipe recipe) {
        var recipeIndex = IntStream.range(0, RECIPES.size())
                .filter(index -> RECIPES.get(index)
                        .getName().equals(recipe.getName()))
                .findFirst()
                .orElse(-1);
        if (recipeIndex > -1) {
            RECIPES.set(recipeIndex, recipe);
            return recipe;
        }
        return null;
    }

    public void deleteRecipe(String name) {
        var recipe = findByName(name);
        if (recipe != null) {
            RECIPES.remove(recipe);
        }
    }


}
