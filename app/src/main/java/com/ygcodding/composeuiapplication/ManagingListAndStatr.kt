package com.ygcodding.composeuiapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ManagingListAndState() {
    var name by remember { mutableStateOf("") }
    var names by remember { mutableStateOf(listOf<String>()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                modifier = Modifier.weight(1f),
                value = name,
                onValueChange = { name = it }
            )
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = {
                    names = names + name
                    name = ""
                }
            ) {
                Text(text = "Add", style = TextStyle(
                    fontSize = 20.sp
                ))
            }
        }

        NamesList(names = names)
    }
}

@Composable
fun NamesList(modifier: Modifier = Modifier, names : List<String>) {
    LazyColumn(
        modifier = modifier.fillMaxWidth()
    ) {
        items(names) { name ->
            Text(
                text = name,
                style = TextStyle(
                    fontSize = 30.sp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 16.dp)
            )
            HorizontalDivider()
        }
    }
}