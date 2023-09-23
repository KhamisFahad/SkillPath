package com.example.skillpath.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.skillpath.ui.theme.GhostWhite
import com.example.skillpath.ui.theme.RoyalBlue


@Composable
fun Modules() {

    val navController = rememberNavController()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(RoyalBlue)
        // .background(brush = Brush.verticalGradient(listOf(GhostWhite, SpaceCadet )))
    ) {
        //Spacer(Modifier.padding(10.dp))

        Spacer(modifier = Modifier.padding(90.dp))

        Card(
            modifier = Modifier
                .background(RoyalBlue)
                .fillMaxHeight(),
            shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .align(Alignment.CenterHorizontally)
                    .background(GhostWhite)
                    .padding(5.dp),
            ) {
                //Module One
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(5.dp)
                        .clickable { },
                    shape = RoundedCornerShape(15.dp),
                ) {
                    Row {

                    }
                }
                //Module Two
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(5.dp)
                        .clickable { },

                    shape = RoundedCornerShape(15.dp)
                ) {
                    Row {

                    }
                }
                //Module three
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(5.dp)
                        .clickable { },
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Row {

                    }
                }
                //Module four
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(5.dp)
                        .clickable { },

                    shape = RoundedCornerShape(15.dp)
                ) {
                    Row {

                    }
                }
            }
        }


    }

}

@Preview
@Composable
fun ModulesPreview() {
    Modules()
}