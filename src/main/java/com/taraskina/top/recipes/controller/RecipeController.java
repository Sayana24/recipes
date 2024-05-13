package com.taraskina.top.recipes.controller;

import com.taraskina.top.recipes.model.Recipe;
import com.taraskina.top.recipes.service.RecipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
@AllArgsConstructor
public class RecipeController {
    private RecipeService service;
    @GetMapping
    public List<Recipe> findAllRecipe(){
        return service.findAllRecipe();
    }
    @PostMapping("save_recipe")
    public Recipe saveRecipe(@RequestBody Recipe recipe){
        return service.saveRecipe(recipe);
    }
    @GetMapping("/{name}")
    public Recipe findByName(@PathVariable String name){
        return service.findByName(name);
    }
    @PutMapping("update_recipe")
    public Recipe updateRecipe(@RequestBody Recipe recipe){
        return service.updateRecipe(recipe);
    }
    @DeleteMapping("delete_recipe/{name}")
    public void deleteRecipe(@PathVariable String name){
        service.deleteRecipe(name);
    }

    @GetMapping("/{name}/short")
    public String findByNameShort(@PathVariable String name){
        return service.findByName(name).getType()+ "\n " +service.findByName(name).getIngredients();
    }
    @GetMapping("/{name}/ingredients")
    public String findByNameIngredients(@PathVariable String name){
        return service.findByName(name).getIngredients();
    }
    @GetMapping("/{name}/url")
    public String findByNameUrl(@PathVariable String name){
        return service.findByName(name).getText();
    }


}
