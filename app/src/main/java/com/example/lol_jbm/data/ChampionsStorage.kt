package com.example.lol_jbm.data

import com.example.lol_jbm.R

object ChampionsStorage {
    fun getChampion(): List<Champion>{
        return listOf(
            Champion(
                id = 1,
                name = "Annie",
                description = "Hija de la oscuridad",
                image = R.drawable.annie
            ),

            Champion(
                id = 2,
                name = "Diana",
                description = "La Ira de la Luna",
                image = R.drawable.diana
            ),

            Champion(
                id = 3,
                name = "Fizz",
                description = "El Bromista de las Mareas",
                image = R.drawable.fizz
            ),

            Champion(
                id = 4,
                name = "Irelia",
                description = "Cuchilla Danzante",
                image = R.drawable.irelia
            ),

            Champion(
                id = 5,
                name = "Leona",
                description = " La Portadora de la Luz",
                image = R.drawable.leona
            ),

            Champion(
                id = 6,
                name = "Mordekaiser",
                description = "El Renacido de Hierro",
                image = R.drawable.mordekaiser
            ),

            Champion(
                id = 7,
                name = "Neeko",
                description = "Magia de camaleón",
                image = R.drawable.neeko
            ),

            Champion(
                id = 8,
                name = "Senna",
                description = "La Redentora",
                image = R.drawable.senna
            ),

            Champion(
                id = 9,
                name = "Taric",
                description = "El Protector",
                image = R.drawable.taric
            ),

            Champion(
                id = 10,
                name = "Teemo",
                description =  "El Explorador Veloz",
                image = R.drawable.teemo
            ),

            Champion(
                id = 11,
                name = "VI",
                description = "La ejecutora de Piltover",
                image = R.drawable.vi
            ),

            Champion(
                id = 12,
                name = "Ziggs",
                description = "Experto en Hexplosivos",
                image = R.drawable.ziggs
            ),
        )
    }
}