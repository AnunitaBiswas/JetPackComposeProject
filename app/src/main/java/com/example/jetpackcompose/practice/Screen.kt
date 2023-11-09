package com.example.jetpackcompose.practice

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R


@Preview(heightDp = 600)
@Composable
fun PreviewItem() {
   LazyColumn(content = {
       items(getCategoryList()) { item->
           EmpDetails(img =item.img , title =item.title , subtitle = item.subtitle )
       }
   })
}

@Composable
fun PreviewItem1() {
   Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
       getCategoryList().map { item->
           EmpDetails(
               img = R.drawable.baseline_attribution_24,
               title = item.title,
               subtitle = item.subtitle
           )
       }
   }
}

@Composable
fun EmpDetails(img: Int, title: String, subtitle: String) {
    Card(/*elevation = 8.dp,*/ modifier = Modifier.padding(6.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
                    .padding(4.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, modifier = Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Thin,
            /*fontSize = 10.sp*/
        )
    }
}

data class Category(val img:Int,val title: String,val subtitle: String)

fun getCategoryList(): MutableList<Category>{
    val list= mutableListOf<Category>()
    list.add(Category(R.drawable.baseline_attribution_24,"Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Android","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Java Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Android","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Java Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Android","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Java Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Android","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Java Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Android","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Java Programming","Learn New Skills"))
    list.add(Category(R.drawable.baseline_attribution_24,"Programming","Learn New Skills"))
    return list
}
















