package com.example.quiztest2.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiztest2.R


@Composable
fun FirstScreen(
    onNextClick: () -> Unit
){
//    val provider = GoogleFont.Provider(
//        providerAuthority = "com.google.android.gms.fonts",
//        providerPackage = "com.google.android.gms",
//        certificates = R.array
//    )

    val brush = ShaderBrush(ImageShader(ImageBitmap.imageResource(id = R.drawable.img_4)))

    Column(
        Modifier
            .background(brush)
            .fillMaxWidth()
            .fillMaxHeight()) {
        Text(
            text = "match the cover of the book with the famous line",
            color = MyColor,
            style = TextStyle(
                lineHeight = 50.sp,
                fontWeight = FontWeight(500)
            ),
            fontSize = 50.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 400.dp)

        )

        Box(modifier = Modifier
            .align(CenterHorizontally)
            .padding(top = 100.dp)){
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Start",
                modifier = Modifier
                    .clickable {
                        onNextClick
                    }
            )
            Text(
                text = "Start",
                modifier = Modifier.align(Center),
                color = Color.White,
                fontSize = 20.sp
            )
        }



    }
}