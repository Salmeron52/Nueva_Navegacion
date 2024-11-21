package com.buenhijogames.nuevanavegacion.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.buenhijogames.nuevanavegacion.ui.pantallas.PantallaDetail
import com.buenhijogames.nuevanavegacion.ui.pantallas.PantallaHome
import com.buenhijogames.nuevanavegacion.ui.pantallas.PantallaLogin

@Composable
fun Navegacion(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Login) {
        composable<Login> { PantallaLogin { navController.navigate(Home) } }
        composable<Home> { PantallaHome { navController.navigate(Detail(esteTexto = it)) } }
        composable<Detail> {
            val detail: Detail = it.toRoute() // Convertir a la clase Detail desde la ruta
            PantallaDetail(esteTexto = detail.esteTexto) {
                navController.navigate(Login) {
                    popUpTo<Login> { inclusive = true } // Limpiar la pila de navegación hasta Home inclusive
                }
            }
        }
    }
}