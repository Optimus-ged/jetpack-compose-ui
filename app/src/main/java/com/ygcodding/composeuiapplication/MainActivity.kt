package com.ygcodding.composeuiapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ygcodding.composeuiapplication.ui.theme.ComposeUiApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeUiApplicationTheme {
                var num1 by remember {
                    mutableStateOf("0")
                }
                var num2 by remember {
                    mutableStateOf("0")
                }

               Column {
                   Text(text = "basic calcuculator", modifier = Modifier.padding(start = 20.dp, top = 50.dp))
                   TextField(
                       value = num1,
                       onValueChange = {
                           num1=it
                       }
                   )
                   TextField(
                       value = num2,
                       onValueChange = {
                           num2=it
                       }
                   )
                   Row(
                       modifier = Modifier.padding(top = 50.dp)
                   ) {
                       Button(
                           onClick = {
                               val result = num1.toInt() + num2.toInt()
                               Toast.makeText(applicationContext, "The result is $result", Toast.LENGTH_SHORT).show()
                           }
                       ) {
                           Text("+")
                       }
                       Spacer(modifier = Modifier.padding(end = 20.dp))
                       Button(
                           onClick = {
                               var result = 0
                               if(num1.toInt() > num2.toInt()){
                                  result = num1.toInt() - num2.toInt()
                                   Toast.makeText(applicationContext, "The result is $result", Toast.LENGTH_SHORT).show()
                               }

                           }
                       ) {
                           Text("-")
                       }
                       Spacer(modifier = Modifier.padding(end = 20.dp))
                       Button(
                           onClick = {
                               val result = num1.toInt() * num2.toInt()
                               Toast.makeText(applicationContext, "The result is $result", Toast.LENGTH_SHORT).show()
                           }
                       ) {
                           Text("*")
                       }
                       Spacer(modifier = Modifier.padding(end = 20.dp))
                       Button(
                           onClick = {
                               var result = 0
                               if(num1.toInt() > num2.toInt()){
                                   result = num1.toInt() / num2.toInt()
                                   Toast.makeText(applicationContext, "The result is $result", Toast.LENGTH_SHORT).show()
                               }

                           }
                       ) {
                           Text("/")
                       }
                   }
               }
            }
        }
    }
}
