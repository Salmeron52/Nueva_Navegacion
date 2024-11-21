package com.buenhijogames.nuevanavegacion.ui.pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun PantallaHome(modifier: Modifier = Modifier, onNavigateToDetail: (String) -> Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var texto by remember { mutableStateOf("") }
        Spacer(modifier = Modifier.weight(1f))
        Text("Pantalla Home", modifier = modifier, fontSize = 24.sp)
        Spacer(modifier = Modifier.weight(.5f))
        TextField(texto, { texto = it }, label = { Text("Escribe algo") })
        Spacer(modifier = Modifier.weight(.5f))
        Button(onClick = { onNavigateToDetail(texto) }) { Text("Navegar al detalle") }
        Spacer(modifier = Modifier.weight(1f))
    }
}