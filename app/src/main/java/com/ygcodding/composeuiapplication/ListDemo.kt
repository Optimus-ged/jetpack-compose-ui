package com.ygcodding.composeuiapplication

import android.provider.CalendarContract.Colors
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun ListDemo() {
    LazyColumnDemo()
}

@Composable
fun LazyColumnDemo() {
    val alphabets = listOf("A", "B", "C", "D", "F")
    LazyColumn {
//        items(
//            count = 50,
//            itemContent = {
//                BuildItem(value = "item $it")
//            }
//        )
        itemsIndexed(alphabets, itemContent = {index, item ->
            BuildItem("item $item index $index")
        })
    }
}

@Composable
fun SimpleColumn() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
    ) {
        for (i in 1..50) {
           BuildItem("$i")
        }
    }
}

@Composable
fun BuildItem(value: String) {
    Log.i("ged", "rendering the item")
    Text(
        text = "value $value", style = TextStyle(
            fontSize = 40.sp,
            textAlign = TextAlign.Center,),
        modifier = Modifier.fillMaxWidth()
    )
}