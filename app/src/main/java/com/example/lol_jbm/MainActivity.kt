package com.example.lol_jbm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.lol_jbm.ui.theme.LOLJBMTheme
import com.example.lol_jbm.ui.theme.screen.ObjectScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LOLJBMTheme {
                ObjectScreen()
            }
        }
    }
}

