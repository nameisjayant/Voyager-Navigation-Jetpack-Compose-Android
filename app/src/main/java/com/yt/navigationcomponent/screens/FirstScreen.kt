package com.yt.navigationcomponent.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class FirstScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Button(onClick = {
//            navigator.push(SecondScreen())
            navigator push SecondScreen()
            navigator += SecondScreen()
        }) {
            Text(text = "Click here")
        }
    }

}

class SecondScreen : Screen{

    @Composable
    override fun Content() {
        Text(text = "Second screen")
    }

}