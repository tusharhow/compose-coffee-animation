package com.example.composezoomanimation.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composezoomanimation.utils.CoffeeCupSize
import com.example.composezoomanimation.components.ChangeSizeButton
import com.example.composezoomanimation.controllers.changeSize

@Composable
fun ChangingButton() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(30.dp),
        modifier =  Modifier
            .fillMaxWidth()
            .padding(start = 45.dp, end = 30.dp, top = 40.dp)

    ) {
        ChangeSizeButton(onclick = {

            changeSize(
                newCoffeeCupSize = CoffeeCupSize.SMALL
            )
        }, text = "S")
        ChangeSizeButton(onclick = {

            changeSize(
                newCoffeeCupSize = CoffeeCupSize.MEDIUM
            )
        }, text = "M")
        ChangeSizeButton(onclick = {

            changeSize(
                newCoffeeCupSize = CoffeeCupSize.LARGE
            )
        }, text = "L")
    }
}