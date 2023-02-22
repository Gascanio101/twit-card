package com.example.twittercopy

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyColumnSpacer(size: Int) {
    Spacer(modifier = Modifier.height(size.dp))
}

@Composable
fun MyRowSpacer(size: Int) {
    Spacer(modifier = Modifier.width(size.dp))
}

@Composable
fun TwitCardHeaderText(text: String, modifier: Modifier) {
    Text(text, fontSize = 16.sp, fontWeight = FontWeight.Medium, color = Color.White)
}

@Composable
fun TwitCardBodyText(text: String, modifier: Modifier) {
    Text(text, color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Light, maxLines = 10, modifier = modifier)
}