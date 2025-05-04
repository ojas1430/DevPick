package com.ojasx.devpick

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ojasx.devpick.CardsList.SecondScreen
import com.ojasx.devpick.MainScreen.MainScreen
import com.ojasx.devpick.TechStackScreens.WebScreen.CardsOfWebDev
import com.ojasx.devpick.TechStackScreens.WebScreen.InfoScreen.HtmlInfoScreen
import com.ojasx.devpick.TechStackScreens.WebScreen.InfoScreen.MysqlInfoScreen
import com.ojasx.devpick.TechStackScreens.WebScreen.InfoScreen.NodeJsInfoScreen

@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "MainScreen"){
        composable("MainScreen"){
            MainScreen(navController)
        }
        composable ("SecondScreen"){
            SecondScreen(navController)

        }
        composable("WebCard") {
            CardsOfWebDev(navController)
        }
        composable("HtmlInfoScreen") {
            HtmlInfoScreen(navController)
        }
        composable ("NodejsInfoScreen"){
            NodeJsInfoScreen(navController)
        }
        composable("MySqlInfoScreen") {
            MysqlInfoScreen(navController)
        }

    }
}