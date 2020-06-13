package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long IngredientId);
    IngredientCommand saveIngredientCommand(IngredientCommand command);
    void deleteIngredientById(Long recipeId, Long ingredientId);
}
