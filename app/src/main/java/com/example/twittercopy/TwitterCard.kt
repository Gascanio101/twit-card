package com.example.twittercopy

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val backgroundTwitterColor = Color(0xFF191f2a)

@Composable
fun TwitterCard() {

    Row(
        Modifier
            .fillMaxSize()
            .background(color = backgroundTwitterColor)
            .padding(16.dp)
    ) {

        Image(
            painterResource(R.drawable.profile),
            contentDescription = "",
            modifier = Modifier
                .clip(shape = CircleShape)
                .size(64.dp)
                .border(shape = CircleShape, color = Color.White, width = 1.dp)
        )

        CardBody()
    }

}

@Composable
fun CardBody() {

    val commented by rememberSaveable { mutableStateOf(false) }
    val retwitted by rememberSaveable { mutableStateOf(false) }
    val liked by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 24.dp, bottom = 24.dp)
    ) {

        TwitterCardBodyHeader()
        MyColumnSpacer(size = 4)
        TwitterCardBody()
        MyColumnSpacer(size = 8)
        Image(
            painter = painterResource(R.drawable.profile),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(shape = RoundedCornerShape(24.dp))

        )
        MyColumnSpacer(size = 8)
        IconRow(commented, retwitted, liked)
    }
}

@Composable
fun IconRow(commented: Boolean, retwitted: Boolean, liked: Boolean) {



}

@Composable
fun TwitterCardBody() {
    TwitCardBodyText(
        text = "This is a description. The text should be long enough for the example to be valid. \n"
                + "This is a description. The text should be long enough. \n",
        modifier = Modifier.verticalScroll(enabled = true, state = rememberScrollState())
    )
}

@Composable
fun TwitterCardBodyHeader() {
    Row(modifier = Modifier.fillMaxWidth()) {
        TwitCardHeaderText(text = "Gabs", modifier = Modifier)
        MyRowSpacer(size = 8)
        Text("@GabDev", fontSize = 16.sp, color = Color.LightGray, fontWeight = FontWeight.Light)
        MyRowSpacer(size = 8)
        Text("17h", color = Color.LightGray, fontSize = 16.sp, fontWeight = FontWeight.Light)
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            painter = painterResource(R.drawable.ic_dots),
            contentDescription = "",
            tint = Color.White
        )
    }
}
