package com.example.quiztest2.ui.theme

object QuestionStorage {
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Нужно быть очень смелым, чтобы противостоять врагу. Но не меньше смелости нужно, чтобы противостоять друзьям. ",
            "Гарри поттер"
        )
        questionList.add(question1)

        val question2 = Question(
            3,
            "Если бы я мог лучше учить ребят, я бы ни о чем больше не мечтал. ",
            "Первый учитель"
        )
        questionList.add(question2)

        val question3 = Question(
            3,
            "Сам того не ведая, он совершил подвиг. ",
            "Первый учитель"
        )
        questionList.add(question3)

        val question4 = Question(
            2,
            "Нужно бежать со всех ног, чтобы только оставаться на месте, а чтобы куда-то попасть, надо бежать как минимум вдвое быстрее! ",
            "Алиса в стране чудес"
        )
        questionList.add(question4)

        val question5 = Question(
            1,
            "Если тебя сильно любят, то даже когда человек умирает, ты остаешься под его защитой. ",
            "Гарри поттер"
        )
        questionList.add(question5)

        val question6 = Question(
            3,
            "Наверно, мы все любили тогда своего учителя за его человечность, за его добрые помыслы, за его мечты о нашем будущем. ",
            "Первый учитель"
        )
        questionList.add(question6)

        val question7 = Question(
            2,
            "Какой сегодня день странный! А вчера всё шло, как обычно! ",
            "Алиса в стране чудес"
        )
        questionList.add(question7)

        val question8 = Question(
            2,
            "Нельзя делать то, что нельзя. ",
            "Алиса в стране чудес"
        )
        questionList.add(question8)

        val question9 = Question(
            1,
            "Человеку нельзя жить в мечтах и забывать настоящую жизнь ",
            "Гарри поттер"
        )
        questionList.add(question9)

        val question10 = Question(
            1,
            "Люди имеют привычку выбирать то, что для них хуже всего. В этом и заключается вся беда ",
            "Гарри поттер"
        )
        questionList.add(question10)

        return questionList
    }
}