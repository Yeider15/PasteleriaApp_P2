package com.example.pasteleriaapp_p2.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable

// Definimos el esquema de colores utilizando los colores personalizados
private val LightColors = lightColorScheme(
    primary = DarkPink,       // Rosa fuerte para los elementos principales
    secondary = LightPink,   // Rosa claro para los botones o elementos secundarios
    surface = Cream,         // Fondo suave (colores de superficie como las tarjetas)
    onSurface = DarkBrown    // Color para texto en superficies (oscuro para legibilidad)
)

@Composable
fun PasteleriaApp_P2Theme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors, // Aplica los colores
        typography = typography,   // Aplica las tipografías
        shapes = Shapes(),         // Usamos la configuración predeterminada para las formas
        content = content
    )
}