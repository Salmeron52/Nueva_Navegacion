package com.buenhijogames.nuevanavegacion.ui.pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun PantallaDetail(
    modifier: Modifier = Modifier,
    esteTexto: String,
    onNavigateToLogin: () -> Unit = {}
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var texto by remember { mutableStateOf("") }
        Spacer(modifier = Modifier.weight(1f))
        Text("Pantalla Detail $esteTexto", modifier = modifier, fontSize = 24.sp)
        Spacer(modifier = Modifier.weight(.5f))
        Button(onClick = { }) { Text("Navegar a ajustes") }
        Button(onClick = { onNavigateToLogin() }) { Text("Logout") }
        Spacer(modifier = Modifier.weight(1f))
    }
}