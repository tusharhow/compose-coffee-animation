package com.example.composezoomanimation.controllers

import androidx.compose.runtime.mutableStateOf
import com.example.composezoomanimation.utils.CoffeeCupSize

val coffeeCupSize = mutableStateOf(CoffeeCupSize.SMALL)
fun changeSize(newCoffeeCupSize: CoffeeCupSize) {
    coffeeCupSize.value = newCoffeeCupSize
}