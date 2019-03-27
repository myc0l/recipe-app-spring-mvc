package com.springmvc.recipeapp.services;

import com.springmvc.recipeapp.commands.IngredientCommand;

public interface IngredientService  {

    IngredientCommand findByRecipeAndIngredientId(Long recipeID, Long ingredientId);
    IngredientCommand saveIngredientCommand(IngredientCommand command);
    void deleteById(Long recipeId, Long idToDelete);

}
