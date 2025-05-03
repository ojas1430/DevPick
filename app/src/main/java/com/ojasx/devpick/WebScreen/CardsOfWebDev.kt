package com.ojasx.devpick.WebScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import com.ojasx.devpick.WebScreen.BackendTech.DjangoCard
import com.ojasx.devpick.WebScreen.DB.MongoDbCard
import com.ojasx.devpick.WebScreen.DB.MySqlCard
import com.ojasx.devpick.WebScreen.FrontEndTech.CssCard
import com.ojasx.devpick.WebScreen.FrontEndTech.HtmlCard
import com.ojasx.devpick.WebScreen.FrontEndTech.JsCard
import com.ojasx.devpick.WebScreen.FrontEndTech.NodeJsCard
import com.ojasx.devpick.ui.theme.Coral
import com.ojasx.devpick.ui.theme.magenta
import com.ojasx.devpick.ui.theme.peach
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import com.ojasx.devpick.R



@Preview
@Composable
fun CardsOfWebDev(modifier: Modifier = Modifier) {
    val frontendCards = listOf<@Composable () -> Unit>(
        { HtmlCard() }, { CssCard() }, { JsCard() }
    )

    val backendCards = listOf<@Composable () -> Unit>(
        { NodeJsCard() }, { DjangoCard() }
    )

    val databaseCards = listOf<@Composable () -> Unit>(
        { MySqlCard() }, { MongoDbCard() }
    )

    val imagelist = listOf(R.drawable.upward)





    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(peach, magenta)
                )
            )
            .border(8.dp, Coral)
            .padding(1.dp)

    ) {
        Column {
            Spacer(Modifier.height(25.dp))

            Text("Explore Web Dev Stack",
                style = TextStyle(
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline

                ),modifier = Modifier.align(Alignment.CenterHorizontally)
            )





//            AsyncImage(
//                model = "https://tenor.com/bKpgX.gif",
//                contentDescription = "Developer GIF",
//                modifier = Modifier
//                    .size(200.dp)
//                    .align(Alignment.CenterHorizontally)
//            )

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                state = rememberLazyGridState(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                userScrollEnabled = true
            ) {
                items(imagelist.size) { index ->
                    Box(
                        modifier = Modifier
                            .padding(8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = imagelist[index]),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }

                // frontend
                item(span = { GridItemSpan(2) }) {
                    Text(
                        text = "Frontend Technologies",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            textDecoration = TextDecoration.Underline
                        ),
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }

                items(frontendCards.size) { index ->
                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .padding(4.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.9f)
                        ) {
                            frontendCards[index]()
                        }
                    }
                }


                //Backend
                item(span = { GridItemSpan(2) }) {
                    Text(
                        text = "Backend Technologies",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            textDecoration = TextDecoration.Underline
                        ),
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }

                items(backendCards.size) { index ->
                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .padding(4.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.9f)
                        ) {
                            backendCards[index]()
                        }
                    }
                }

                // DB

                item(span = { GridItemSpan(2) }) {
                    Text(
                        text = "DataBase Technologies",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            textDecoration = TextDecoration.Underline
                        ),
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }

                items(databaseCards.size) { index ->
                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .padding(4.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.9f)
                        ) {
                            databaseCards[index]()
                        }
                    }
                }

            }
        }
    }
}