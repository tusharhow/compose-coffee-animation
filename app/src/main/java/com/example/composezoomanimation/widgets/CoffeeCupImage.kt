package com.example.composezoomanimation.widgets

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composezoomanimation.utils.CoffeeCupSize
import com.example.composezoomanimation.controllers.coffeeCupSize
import com.example.composezoomanimation.R

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun CoffeeCupImage() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        AnimatedContent(
            targetState = coffeeCupSize.value,
            transitionSpec = {
                fadeIn(animationSpec = tween(durationMillis = 300)) with
                        fadeOut(animationSpec = tween(durationMillis = 500))
            }
        ) { targetState ->
            Image(
                painter = painterResource(id = R.drawable.starbuckscup), contentDescription = null,
                modifier = Modifier
                    .padding(20.dp)
                    .size(
                        when (targetState) {
                            CoffeeCupSize.SMALL -> 150.dp
                            CoffeeCupSize.MEDIUM -> 250.dp
                            CoffeeCupSize.LARGE -> 350.dp
                        }
                    )
            )
        }
    }
}