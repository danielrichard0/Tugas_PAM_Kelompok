package edu.uksw.fti.pam.acitivityintent.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.R
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import StoreUserData
import android.content.Context
import androidx.compose.foundation.layout.BoxScope

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun ProfileScreen() {
    val context = LocalContext.current
    val dataStore = StoreUserData(context)
    var savedFirstName = dataStore.getName.collectAsState(initial = "")
    var savedLastName = dataStore.getLName.collectAsState(initial = "")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(40, 40, 50))
            .height(500.dp)

    ) {
        Text(
            text = "Profile",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(top = 10.dp),
            textAlign = TextAlign.Center,
            fontSize = 20.sp

        )
        Image(
            painter = painterResource(R.drawable.pressefoto),
            contentDescription = "Foto_Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 60.dp)
                .size(128.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
                .fillMaxHeight()
        )
        Row(
             modifier = Modifier
                 .align(Alignment.CenterHorizontally)
                 .padding(top = 20.dp)
        ) {
            Text(
                text = savedFirstName.value!!,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            )
            Text(
                text = savedLastName.value!!,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 10.dp)
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
        ) {
            Text(
                text = "Surakarta, Indonesia",
                fontWeight = FontWeight.Light,
                fontSize = 18.sp,
                color = Color.White
            )
        }
        Image(
            painter = painterResource(R.drawable.settings_outline_rounded),
            contentDescription = "Foto_Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 60.dp, bottom = 30.dp)
                .size(64.dp),
        )

    }


}


@Preview(showBackground = true)
@Composable
fun DefaultPreviewPS() {
    PAMAcitivityIntentTheme {
        ProfileScreen()
    }
}