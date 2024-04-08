package com.muthoni.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muthoni.login.ui.theme.LoginTheme
import java.time.format.TextStyle

class Simplelist : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Simplelistview()
                }
            }
        }
    }
}
private val nameList= mutableListOf("Erick","Purity","Faith","Daniel","Alex","Joan","Kelly","Victor","Erick","Purity","Faith","Daniel","Alex","Joan","Kelly","Victor","Erick","Purity","Faith","Daniel","Alex","Joan","Kelly","Victor")
private val listModifier=Modifier
    .fillMaxSize()
    .background(Color.Cyan)
    .padding(30.dp)

private val textStyle=androidx.compose.ui.text.TextStyle(fontSize= 25.sp, color = Color.Red)
@Composable
fun Simplelistview() {
    LazyRow(modifier = listModifier) {
        items(nameList){
            jina ->
            Text(text = jina, onTextLayout = {},style = textStyle)
        }

    }


}

@Preview
@Composable
private fun Mylistprev() {
    Simplelistview()
    
}