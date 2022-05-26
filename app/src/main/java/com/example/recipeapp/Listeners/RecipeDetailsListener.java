package com.example.recipeapp.Listeners;

import com.example.recipeapp.Models.RecipeDetailsResponce;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponce response, String message);
    void didError(String message);
}
