package edu.uksw.fti.pam.acitivityintent.ui.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.R
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme

@Composable
fun ForecastScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(40, 40, 50))

    ) {
        Text(
            text = stringResource(id = R.string.weather_forecast),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 10.dp),

            fontSize = 20.sp
        )
    }

    Box(
        modifier = Modifier
            .padding(top = 50.dp)

    ) {



        Row(
            Modifier
                .padding(start = 25.dp, top = 20.dp, end = 25.dp)
        ) {

            Text(
                text = stringResource(id = R.string.Today),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )


            Text(
                text = stringResource(id = R.string.day_forcast),
                Modifier.fillMaxWidth(),
                textAlign = TextAlign.End,
                fontSize = 20.sp,
                color = Color.Gray,

                )
        }
        Row(Modifier.padding(top = 70.dp, start = 25.dp, end =25.dp)) {
            Divider(color = Color.White, thickness = 1.dp)
        }
        Row(

            Modifier
                .padding(top = 80.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_4),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 20.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.img_5),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 20.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.img_6),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.img_7),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 20.dp)
            )
        }
        // jam waktu
        Row() {
            TextGenerator("12AM", 90.dp)
            TextGenerator("Now", 90.dp)
            TextGenerator("1PM", 90.dp)
            TextGenerator("2PM", 90.dp)
        }
        Row() {
            TextGenerator(textInput = "34°", offsetInput = 165.dp)
            TextGenerator(textInput = "20°", offsetInput = 165.dp)
            TextGenerator(textInput = "31°", offsetInput = 165.dp)
            TextGenerator(textInput = "28°", offsetInput = 165.dp)
        }

        Row(Modifier.padding(top = 220.dp, start = 25.dp, end =25.dp)) {
            Divider(color = Color.White, thickness = 1.dp)
        }

        Row (
            modifier = Modifier
        ){

            TextGenerator(stringResource(id = R.string.monday), offsetInput = 250.dp)

            Image(
                painter = painterResource(id = R.drawable.img_7),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 210.dp)

            )
        }

        Row (modifier = Modifier){

            TextGenerator(stringResource(id = R.string.tuesday), offsetInput = 330.dp)



            Image(
                painter = painterResource(id = R.drawable.img_4),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 290.dp)

            )
        }

        Row (modifier = Modifier){

            TextGenerator(stringResource(id = R.string.wedneseday), offsetInput = 410.dp)



            Image(
                painter = painterResource(id = R.drawable.img_7),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 370.dp)

            )
        }

        Row (modifier = Modifier){

            TextGenerator(stringResource(id = R.string.thursday), offsetInput = 490.dp)



            Image(
                painter = painterResource(id = R.drawable.img_5),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 450.dp)

            )
        }

        Row(Modifier.padding(top = 550.dp, start = 25.dp, end =25.dp)) {
            Divider(color = Color.White, thickness = 1.dp)
        }



//    Box(modifier = Modifier.background(Color(40,40,50))
//        .size(300.dp, 150.dp)
//    ) {
//
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPrevieww() {
    PAMAcitivityIntentTheme {
        ForecastScreen()
    }
}