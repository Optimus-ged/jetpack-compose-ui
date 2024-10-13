package com.ygcodding.composeuiapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun StateTestScreen() {
    var name by rememberSaveable { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Greetings(name = name)
        GreetName(value = name, onValueChange = {
            name = it
        })
    }
}

@Composable
fun Greetings(modifier: Modifier = Modifier, name:String) {
    Text(text = "Hello $name")
}

@Composable
fun GreetName(modifier: Modifier = Modifier, value: String, onValueChange:(String)-> Unit) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text("Enter a name")
        }
    )
}