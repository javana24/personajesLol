package com.example.lol_jbm.data

import com.example.lol_jbm.R

object ChampionsStorage {
    fun getChampion(): List<Champion>{
        return listOf(
            Champion(
                name = "Annie",
                description = "Hija de la oscuridad",
                image = R.drawable.annie
            ),

            Champion(
                name = "Diana",
                description = "La Ira de la Luna",
                image = R.drawable.diana
            ),

            Champion(
                name = "Fizz",
                description = "El Bromista de las Mareas",
                image = R.drawable.fizz
            ),

            Champion(
                name = "Irelia",
                description = "Cuchilla Danzante",
                image = R.drawable.irelia
            ),

            Champion(
                name = "leona",
                description = " La Portadora de la Luz",
                image = R.drawable.leona
            ),

            Champion(
                name = "Mordekaiser",
                description = "El Renacido de Hierro",
                image = R.drawable.mordekaiser
            ),

            Champion(
                name = "Neeko",
                description = "Magia de camaleón",
                image = R.drawable.neeko
            ),

            Champion(
                name = "Senna",
                description = "La Redentora",
                image = R.drawable.senna
            ),

            Champion(
                name = "Taric",
                description = "El Protector",
                image = R.drawable.taric
            ),

            Champion(
                name = "Teemo",
                description =  "El Explorador Veloz",
                image = R.drawable.teemo
            ),

            Champion(
                name = "VI",
                description = "La ejecutora de Piltover",
                image = R.drawable.vi
            ),

            Champion(
                name = "Ziggs",
                description = "Experto en Hexplosivos",
                image = R.drawable.ziggs
            ),
        )
    }
}