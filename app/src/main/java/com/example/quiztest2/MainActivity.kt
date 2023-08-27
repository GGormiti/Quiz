package com.example.quiztest2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quiztest2.ui.theme.FirstScreen
import com.example.quiztest2.ui.theme.QuestionScreen
import com.example.quiztest2.ui.theme.ResultScreen
import com.example.quiztest2.ui.theme.ResultViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(
    navController: NavHostController = rememberNavController(),
    viewModel: ResultViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {

    Scaffold() { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding) // #1
        ) {
            AppNavHost(navController, viewModel)
        }
    }
}

@Composable
private fun AppNavHost(
    navController: NavHostController,
    viewModel: ResultViewModel
) {
    val uiState by viewModel.resultCount.collectAsState()
    NavHost(
        navController = navController,
        startDestination = "FirstScreen",
    ) {
        composable(route = "FirstScreen") {
            FirstScreen(
                onNextClick = {
                    navController.navigate("QuestionScreen")
                    navController.popBackStack()
                }
            )
        }

        composable(route = "QuestionScreen") {
            QuestionScreen(
                onNextClick = {
                    navController.navigate("ResultScreen")
                    navController.popBackStack()
                    viewModel.setResult(it)
                }
            )
        }

        composable(route = "ResultScreen") {
            ResultScreen(
                onBackClick = {
                    navController.navigate("QuestionScreen")
                    navController.popBackStack()
                    viewModel.deleteResultat()
                },
                countCorrectAnswer = uiState
            )
        }
    }
}