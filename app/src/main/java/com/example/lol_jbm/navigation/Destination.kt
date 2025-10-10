package com.example.lol_jbm.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Destination(val route: String) {
    @Serializable
    object List: Destination(route = "ObjectScreen")

    @Serializable
    data class Detail(val id:Long): Destination(route="DescriptionScreen")
}