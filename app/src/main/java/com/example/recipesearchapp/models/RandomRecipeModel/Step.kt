package com.example.recipesearchapp.models.RandomRecipeModel

data class Step(
    val number: Long,
    val step: String,
    val ingredients: List<Ingredient2>,
    val equipment: List<Equipment>,
    val length: Length?
)