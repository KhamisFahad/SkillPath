package com.example.skillpath.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.skillpath.ui.theme.GhostWhite

@Composable
fun Home(

) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            //.background(brush = Brush.verticalGradient(listOf(SpaceCadet, TimberWolf)))
            .background(GhostWhite)
    ) {
        Text(text = "Home")
    }

}