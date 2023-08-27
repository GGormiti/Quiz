package com.example.quiztest2.ui.theme

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ResultViewModel: ViewModel() {

    private val _resultCount = MutableStateFlow<Int>(0)
    var resultCount: StateFlow<Int> = _resultCount.asStateFlow()

    fun setResult(correctAnswer: Int){
        _resultCount.value = correctAnswer
    }

    fun deleteResultat(){
        _resultCount.value = 0
    }
}