package com.taraskina.top.recipes.service.impl;

import com.taraskina.top.recipes.model.Recipe;
import com.taraskina.top.recipes.repository.RecipeRepository;
import com.taraskina.top.recipes.service.RecipeService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository repository;
    @Override
    public List<Recipe> findAllRecipe() {
        return repository.findAll();
    }

    @Override
    public Recipe saveRecipe(Recipe recipe) {
        return repository.save(recipe);
    }

    @Override
    public Recipe findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Recipe updateRecipe(Recipe recipe) {
        return repository.save(recipe);
    }

    @Override
    @Transactional
    public void deleteRecipe(String name) {
        repository.deleteByName(name);
    }

}
