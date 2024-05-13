package com.taraskina.top.recipes.repository;

import com.taraskina.top.recipes.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    void deleteByName(String name);
    Recipe findByName(String name);


}
