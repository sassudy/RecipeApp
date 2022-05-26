package com.example.recipeapp.Listeners;

import com.example.recipeapp.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener {
    void didFetch(List<SimilarRecipeResponse> responce, String message);
    void didError(String message);
}
