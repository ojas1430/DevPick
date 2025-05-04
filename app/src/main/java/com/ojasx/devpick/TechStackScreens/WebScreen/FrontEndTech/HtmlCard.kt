package com.ojasx.devpick.TechStackScreens.WebScreen.FrontEndTech

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController

@Composable
fun HtmlCard(navController: NavController) {
    Row (modifier = Modifier.fillMaxSize()){
        Card(
            modifier = Modifier.size(150.dp)
                .clickable(onClick = {
                    navController.navigate("HtmlInfoScreen")
                })
            ,
            elevation = CardDefaults.cardElevation(
                defaultElevation = 15.dp,
                pressedElevation = 25.dp
            ),
            shape = CircleShape,
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
                    .background(brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFB3315F),  // magenta (same as your theme)
                            Color(0xFF5E60CE)   // soft indigo-violet
                        )
                    )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text("HTML",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold

                    )
                )
            }
        }


    }
}