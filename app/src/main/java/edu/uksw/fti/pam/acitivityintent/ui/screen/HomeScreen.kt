package edu.uksw.fti.pam.acitivityintent.ui.screen

import edu.uksw.fti.pam.acitivityintent.R
import androidx.compose.foundation.Canvas
import android.content.Intent
import android.graphics.Paint.Align
import android.graphics.drawable.InsetDrawable
import android.icu.text.ListFormatter.Width
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Canvas
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun HomePage(name: String) {


    Image(
        painter = painterResource(id = R.drawable.pasar_gede),
        contentDescription = "Andy Rubin",
        contentScale = ContentScale.Crop,
        modifier = Modifier
    )


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text = "Hello $name!",
            textAlign = TextAlign.Left,
            color = Color.LightGray,
        )

        Text(text = "Surakarta",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            color = Color.White,
        )
        Text(text = "20°",
            fontSize = 50.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
        )
        Text(text = stringResource(id = R.string.clearr),
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            color = Color.LightGray
        )

        Image(
            painter = painterResource(id = R.drawable.img_10),
            contentDescription = "Andy Rubin",
            Modifier

                .padding(top = 150.dp)


        )
    }




//    Box(modifier = Modifier.background(Color(40,40,50))
//        .size(300.dp, 150.dp)
//    ) {
//
}


//R.drawable.img_8

//fun ImageGenerator(height: Dp, width: Dp , contDesc: String, drawableRes: DrawableRes) {
//    Image(
//        painter = painterResource(id = drawableRes),
//        contentDescription = contDesc,
//        Modifier.height(height)
//            .width(width)
//    )
//
//}

@Composable
fun TextGenerator(textInput: String, offsetInput: Dp) {
    Text(
        text = textInput,
        Modifier
            .width(100.dp)
            .fillMaxHeight()
            .offset(y = offsetInput),
        fontWeight = FontWeight.Bold,
        color = Color.White,
        textAlign = TextAlign.Center
    )

}

@Composable
fun Greeting(name: String) {
    Box() {
        Text(text = "Hello $name!",
            textAlign = TextAlign.Left,
            color = Color.White,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAMAcitivityIntentTheme {
        HomePage("Android")
    }
}