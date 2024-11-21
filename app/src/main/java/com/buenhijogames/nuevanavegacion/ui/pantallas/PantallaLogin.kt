package com.buenhijogames.nuevanavegacion.ui.pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun PantallaLogin(modifier: Modifier = Modifier, onNavigateToHome: () -> Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text("Pantalla de login", modifier = modifier, fontSize = 24.sp)
        Spacer(modifier = Modifier.weight(.5f))
        Button(onClick = { onNavigateToHome() }) { Text("Navegar a Home") }
        Spacer(modifier = Modifier.weight(1f))
    }
}