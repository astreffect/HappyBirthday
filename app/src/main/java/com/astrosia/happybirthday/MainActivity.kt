package com.astrosia.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.astrosia.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    HappyBdText(message =  "Happy Birthday Debarun !" ,from="God")
                }
            }

        }
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String) {
    val image = painterResource(id = R.drawable.headstart)
    Box{

        Image(painter = image, contentDescription =null ,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop)
        HappyBdText(message =  "The Greatest Gift Of God is You" ,from="-Debarun Acharya")
    }

}
@Composable
fun HappyBdText(message: String , from:String){
    Column {
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
                .padding(start = 16.dp, top = 400.dp)
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
                .padding(start = 16.dp, top = 50.dp)
        )
    }


    
}


@Preview(showBackground = true,
showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithImage( "Happy Birthday Sam!", "- from Emma")

    }
}