package com.example.jetpackcompose.practice

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewFun()
        }
    }
}


@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFun() {
    PreviewItem()
   // CircularImageView()
}

@Composable
fun CircularImageView() {
    Image(
        painter = painterResource(id = R.drawable.baseline_attribution_24),
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .padding(6.dp)
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape),
        contentDescription = ""
    )
}

@Composable
fun ListViewItem(image: Int, name: String, occupation: String) {
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "",
            Modifier.size(50.dp)
        )
        Column(Modifier.padding(8.dp)) {
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(
                text = occupation, fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }
    }

}

@Composable
fun TextWithDesign(){
    Text(
        text = "Hello World",
        color = Color.White,
        modifier = Modifier
            .clickable { }
            .background(Color.Magenta)
            .size(200.dp)
            .padding(16.dp)
            .border(4.dp, Color.Black)
            .clip(CircleShape)
            .background(Color.Yellow)

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput() {
    val state = remember { mutableStateOf("") }
    TextField(value = state.value, onValueChange = {
        state.value = it
        Log.d("Print", it)
    }, label = { Text(text = "Enter Name") })
}