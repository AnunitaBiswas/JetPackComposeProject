package com.example.jetpackcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuoteListItem() {
    Card(/*elevation = 4.dp,*/
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                imageVector = Icons.Filled.AccountCircle,
                colorFilter = ColorFilter.tint(Color.White),
                alignment = Alignment.TopStart,
                contentDescription = "Quotes",
                modifier = Modifier
                    .size(40.dp)
                    .rotate(270F)
                    .background(Color.Black)
            )

            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Time is the most valuable thing a man can spend",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
                Box(
                    modifier = Modifier
                        .background(Color(0xFFEEEEEE))
                        .fillMaxWidth(.6f)
                        .height(1.dp)
                )
                Text(
                    text = "Pohgjkahgh", style = MaterialTheme.typography.displaySmall,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(top = 4.dp), fontSize = 12.sp
                )

            }

        }

    }
}

@Preview
@Composable
fun QuoteDetails() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ) {
        Card(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp
            ), modifier = Modifier.padding(32.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    // .align(Alignment.Center)
                    .padding(16.dp, 24.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.ExitToApp, contentDescription = "Quote",
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180F)
                )
                Text(
                    text = "Time is the most valuable thing a man can spend",
                    style = MaterialTheme.typography.displayMedium
                )
                Spacer(Modifier.height(16.dp))
                Text(fontSize = 15.sp,
                    text = "Timeisthemost ",
                    style = MaterialTheme.typography.bodyMedium
                )

            }

        }
    }
}

@Composable
fun TestUI() {
    Column(
        modifier =
        Modifier
            .background(Color.Green)
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .border(5.dp, Color.Magenta)
            .padding(6.dp)
            .border(5.dp, Color.Red)
            .padding(6.dp)
            .border(5.dp, Color.DarkGray)
            .padding(6.dp)

           // .width(300.dp).requiredWidth(300.dp)
    ) {
        Text(text = "Hello", modifier = Modifier.clickable {  }
            /*offset(0.dp,20.dp)*/)
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "World")
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDes: String,
    title: String,
    modifier: Modifier=Modifier
){
  Card(modifier=Modifier.fillMaxWidth(),
      shape = RoundedCornerShape(15.dp),
      elevation = CardDefaults.cardElevation(
      defaultElevation = 5.dp)) {
    Box(modifier = Modifier.height(200.dp)){
        Image(
            painter = painter,
            contentDescription = contentDes,
            contentScale = ContentScale.Crop)
        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color.Black
                    ),
                    startY = 300f
                )
            ))
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
            contentAlignment = Alignment.BottomStart
        ){
            Text(title, style = TextStyle(color= Color.White, fontSize = 15.sp))
        }
    }
  }
}

@Composable
fun EditTextWithButton(){

}




















