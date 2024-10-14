package com.ygcodding.composeuiapplication

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListDemo() {
    ScaffoldExample()
}

@Composable
fun LazyColumnDemo() {
    val alphabets = listOf("A", "B", "C", "D", "F")
    val myList = getMarvelChar()

    LazyColumn {
        itemsIndexed(myList, itemContent = { index, item ->
            MarvelItem(item)
        })
    }

}

@Composable
fun MarvelItem(data: MarvelChar) {
    val context = LocalContext.current
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                Toast
                    .makeText(context, data.name, Toast.LENGTH_SHORT)
                    .show()
            }
    ) {
        Image(
            painter = painterResource(data.imageRes), contentDescription = data.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(64.dp)
                .scale(1f)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(
                text = data.name, style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
            )
            Text(text = data.charName)
        }
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