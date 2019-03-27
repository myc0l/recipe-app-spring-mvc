package com.springmvc.recipeapp.services;

import com.springmvc.recipeapp.commands.RecipeCommand;
import com.springmvc.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    void deleteById(Long idToDelete);
}
