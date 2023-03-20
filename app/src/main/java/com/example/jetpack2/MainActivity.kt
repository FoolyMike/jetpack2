package com.example.jetpack2

import android.graphics.drawable.AnimatedImageDrawable
import android.media.Image
import android.os.Bundle
import android.text.Html.ImageGetter
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack2.ui.theme.Jetpack2Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack2Theme {
                // A surface container using the 'background' color from the theme
                Surface{
                    Greeting("biscuithead")
                    }
                }
            }
        }
    }


@Composable
fun Greeting(name: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .size(400.dp)

    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null)
        Text(
            text = "whats up $name!",
            color = Color.Red,
            fontSize = 30.sp,
        )
        Button()
        Text(text = "Click Here")
    }
}

@Preview(showBackground = true)

@Composable
fun DefaultPreview() {
    Jetpack2Theme {
        Greeting("biscuithead")
    }
}