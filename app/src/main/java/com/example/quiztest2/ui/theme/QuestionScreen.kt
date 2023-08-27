package com.example.quiztest2.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun QuestionScreen(
    onNextClick: (Int) -> Unit
) {
    val brush = ShaderBrush(ImageShader(ImageBitmap.imageResource(id = R.drawable.img_4)))
    var count = 0
    var text by remember { mutableStateOf(QuestionStorage.getQuestions()[count].question) }
    var correctAnswer = 0

    Column(
        Modifier
            .background(brush)
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = text,
            color = MyColor,
            style = TextStyle(
                lineHeight = 50.sp,
                fontWeight = FontWeight(500)
            ),
            fontSize = 17.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 300.dp)

        )

        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 50.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = null,
                modifier = Modifier
                    .clickable {
                        if (QuestionStorage.getQuestions()[count].id == 1){
                            correctAnswer++
                        }
                        count++
                        if (count == 10) {
                            onNextClick(correctAnswer)
                        } else{
                            text = QuestionStorage.getQuestions()[count].question
                        }
                    }.size(125.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.img_2),
                contentDescription = null,
                modifier = Modifier
                    .clickable {
                        if (QuestionStorage.getQuestions()[count].id == 2){
                            correctAnswer++
                        }
                        count++
                        if (count == 10) {
                            onNextClick(correctAnswer)
                        } else{
                            text = QuestionStorage.getQuestions()[count].question
                        }
                    }.size(125.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.img_3),
                contentDescription = null,
                modifier = Modifier
                    .clickable {
                        if (QuestionStorage.getQuestions()[count].id == 3){
                            correctAnswer++
                        }
                        count++
                        if (count == 10) {
                            onNextClick(correctAnswer)
                        } else{
                            text = QuestionStorage.getQuestions()[count].question
                        }
                    }.size(125.dp)
            )
        }
    }
}

