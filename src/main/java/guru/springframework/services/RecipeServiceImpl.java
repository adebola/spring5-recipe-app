package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> findAll() {
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        log.info("RecipeService::findAll");
        return recipes;
    }

    @Override
    public Recipe findById(Long id) {
        return null;
    }

    @Override
    public Recipe save(Recipe recipe) {
        return null;
    }

    @Override
    public void delete(Recipe recipe) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
