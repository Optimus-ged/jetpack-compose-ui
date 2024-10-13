package com.ygcodding.composeuiapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    var emailTxt by remember { mutableStateOf("") }
    var pwdTxt by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "image logo",
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Welcome back",
            style = TextStyle(
                fontSize = 28.sp, fontWeight = FontWeight.Bold
            )
        )
        Text("Login to your account")
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = emailTxt, onValueChange = { emailTxt = it }, label = {
                Text(text = "Email address")
            })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = pwdTxt, onValueChange = { pwdTxt = it },
            label = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {}) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Forgot password?", modifier = Modifier.clickable { })
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Or sign in with")
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Image(painter = painterResource(R.drawable.f), contentDescription = "facebook image")
            Image(painter = painterResource(R.drawable.f), contentDescription = "facebook image")
            Image(painter = painterResource(R.drawable.f), contentDescription = "facebook image")
        }
    }
}