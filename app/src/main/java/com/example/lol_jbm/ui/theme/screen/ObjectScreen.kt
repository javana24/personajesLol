package com.example.lol_jbm.ui.theme.screen

import ListScreen
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost  // ✅ Este es el correcto
import androidx.navigation.compose.composable  // ✅ Necesitas importar esto
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ObjectScreen(){
    val navController = rememberNavController()

    Scaffold (
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = { Text("League of Legends Champions")}
            )
        }
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = "home"
        ){
            composable("home") {
                ListScreen(
                    modifier = Modifier.padding(innerPadding),
                    onNavigateToDetail = {
                        navController.navigate("details")
                    }
                )
            }
            composable(route = "details") {
                DetailsScreen(
                    modifier = Modifier
                        .consumeWindowInsets(innerPadding)
                        .padding(innerPadding),
                    navController = navController
                )
            }
        }
    }
}
