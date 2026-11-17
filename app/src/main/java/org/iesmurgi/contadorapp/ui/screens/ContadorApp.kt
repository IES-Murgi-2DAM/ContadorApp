package org.iesmurgi.contadorapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.iesmurgi.contadorapp.ui.icons.add
import org.iesmurgi.contadorapp.ui.icons.refresh
import org.iesmurgi.contadorapp.ui.theme.ContadorAppTheme
import org.iesmurgi.contadorapp.ui.theme.Pink80

@Composable
fun ContadorApp(modifier: Modifier = Modifier) {
    var contador by remember { mutableIntStateOf(0) }
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Contador: $contador", fontSize = MaterialTheme.typography.headlineLarge.fontSize)
        Button(onClick = { contador++ }) {
            Icon(
                add,
                contentDescription = "Icono de suma",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
        Button(onClick = { contador = 0 }) {
            Icon(
                refresh,
                contentDescription = "Icono de refrescar",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContadorAppPreview() {
    ContadorAppTheme {
        ContadorApp()
    }
}
