package com.taraskina.top.recipes.service.impl;

import com.taraskina.top.recipes.model.Recipe;
import com.taraskina.top.recipes.repository.InMemoryRecipeDAO;
import com.taraskina.top.recipes.service.RecipeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InMemoryRecipeServiceImpl implements RecipeService {
    private final InMemoryRecipeDAO repository;
    @Override
    public List<Recipe> findAllRecipe() {
        return repository.findAllRecipe();
    }

    @Override
    public Recipe saveRecipe(Recipe recipe) {
        return repository.saveRecipe(recipe);
    }

    @Override
    public Recipe findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Recipe updateRecipe(Recipe recipe) {
        return repository.updateRecipe(recipe);
    }

    @Override
    public void deleteRecipe(String name) {
        repository.deleteRecipe(name);
    }

}
