package com.dave_devs.bottomnavigation.bottom_nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dave_devs.bottomnavigation.bottom_nav.screens.HomeScreen
import com.dave_devs.bottomnavigation.bottom_nav.screens.ProfileScreen
import com.dave_devs.bottomnavigation.bottom_nav.screens.SettingsScreen


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}