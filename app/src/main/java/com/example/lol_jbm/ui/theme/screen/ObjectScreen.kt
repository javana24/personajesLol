package com.example.lol_jbm.ui.theme.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lol_jbm.data.Champion
import com.example.lol_jbm.data.ChampionsStorage
import com.example.lol_jbm.ui.theme.components.ChampionItemDesign

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ObjectScreen(){
    val champions: List<Champion> = ChampionsStorage.getChampion()
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = { Text("League of Legends Champions")}
            )
        }
    ){

        paddingValues ->
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
            contentPadding = PaddingValues(8.dp)) {
            items(
             items = champions,
                key = {
                    it.name
                }
            ){
                champion ->
                ChampionItemDesign(champion=champion)
            }
        }
    }
}