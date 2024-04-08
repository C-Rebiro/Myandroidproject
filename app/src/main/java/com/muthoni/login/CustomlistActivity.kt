package com.muthoni.login

import android.graphics.ColorSpace.Model
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muthoni.login.ui.theme.LoginTheme

class CustomlistActivity : ComponentActivity() {
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
                    CustomList()
                }
            }
        }
    }
}
data class FruitModel(val name:String, val image : Int)

@Composable
fun Customlist(model: FruitModel) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color(0xFF063040))
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Text(text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            onTextLayout = {})
    }
}
private val fruitsList = mutableListOf<FruitModel>().apply {
    add(FruitModel("Coffin nails",R.drawable.coffin))
    add(FruitModel("Almond nails",R.drawable.almond))
    add(FruitModel("Square nails",R.drawable.square1))
    add(FruitModel("Stiletto nails",R.drawable.stiletto))
    add(FruitModel("Short stiletto nails",R.drawable.stilettoshort))


}



@Composable
fun CustomList() {
    LazyColumn (
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 35.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        items(fruitsList){model ->
           Customlist(model)

    LazyRow(



    ) {

    }
        }

    }


}

@Preview
@Composable
private fun CustomListprev() {
    CustomList()
    
}




