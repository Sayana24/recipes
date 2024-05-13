package com.taraskina.top.recipes.service;

import com.taraskina.top.recipes.model.Recipe;

import java.util.List;


public interface RecipeService {
    List<Recipe> findAllRecipe();
    Recipe saveRecipe(Recipe recipe);
    Recipe findByName(String name);
    Recipe updateRecipe(Recipe recipe);
    void deleteRecipe(String name);

}
