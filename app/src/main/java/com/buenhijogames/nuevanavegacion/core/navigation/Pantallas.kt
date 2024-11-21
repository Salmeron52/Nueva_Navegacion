package com.buenhijogames.nuevanavegacion.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlinx.serialization.Serializable
import java.io.Serial

@Serializable
object Login

@Serializable
object Home

@Serializable
data class Detail(val esteTexto: String)