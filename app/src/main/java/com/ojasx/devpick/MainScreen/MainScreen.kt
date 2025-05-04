package com.ojasx.devpick.MainScreen

import android.R.attr.button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    val peach = Color(0xFFFFAA85)
    val magenta = Color(0xFFB3315F)

    val gradientBrush = Brush.linearGradient(
        colors = listOf(Color(0xFFFFD700), Color(0xFFFF8C00))
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(peach, magenta)
                )
            )
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(100.dp))

            // ✅ Nested Box to overlay the text
            Box {
                // Bottom layer: black stroke (outline)
                Text(
                    text = "DevPick",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace,
                        drawStyle = Stroke(width = 10f)
                    )
                )

                // Top layer: gradient fill
                Text(
                    text = "DevPick",
                    style = TextStyle(
                        brush = gradientBrush,
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                )
            }
            Spacer(Modifier.height(20.dp))

            Text("Pick Smarter, Code Better!",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    shadow = Shadow(
                        Color.Yellow
                ),

                ),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }


MainScreenButton(navController)
}

