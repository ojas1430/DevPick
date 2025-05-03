package com.ojasx.devpick.CardsList

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ojasx.devpick.ui.theme.deepBlue
import com.ojasx.devpick.ui.theme.lightYellow
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import android.widget.ImageView
import android.graphics.drawable.Drawable
import androidx.compose.ui.res.painterResource
import com.ojasx.devpick.R





@Preview
@Composable
fun WebCard() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .clickable(onClick = {}),
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 15.dp,
            pressedElevation = 25.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFB3315F),  // magenta (same as your theme)
                            Color(0xFF5E60CE)   // soft indigo-violet
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "",
                    modifier = Modifier.size(55.dp)
                )
                Text(
                    "  Web Development",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 26.sp
                    )
                )
            }
        }
    }
}
