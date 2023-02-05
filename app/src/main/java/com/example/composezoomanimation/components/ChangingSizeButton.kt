package com.example.composezoomanimation.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChangeSizeButton(
    text: String,
    onclick: () -> Unit
) {
    OutlinedButton(
        onClick = onclick,
        modifier= Modifier.size(80.dp),
        shape = CircleShape,

        contentPadding = PaddingValues(0.dp),

        content = {
            Text(text = text, style = TextStyle(fontSize = 28.sp))
        }

    )
}