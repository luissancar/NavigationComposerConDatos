package com.example.navigationcomposercondatos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.navArgument


@Composable
fun SecondScreen(id: Int,name:String) {
    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color(120, 45, 67)),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = id.toString(),
            color = Color.Cyan,
            fontSize = 40.sp,
        )

    }
}

