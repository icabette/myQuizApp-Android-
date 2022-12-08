package net.kimsang.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.usa,
            "USA",
            "Austrailia",
            "Armenia",
            "France",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            1, "What country does this flag belong to?",
            R.drawable.brazil,
            "USA",
            "Brazil",
            "Armenia",
            "France",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            1, "What country does this flag belong to?",
            R.drawable.austrailia,
            "USA",
            "Austrailia",
            "Armenia",
            "France",
            2
        )
        questionList.add(que3)

        val que4 = Question(
            1, "What country does this flag belong to?",
            R.drawable.india,
            "USA",
            "Austrailia",
            "India",
            "France",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            1, "What country does this flag belong to?",
            R.drawable.korea,
            "USA",
            "Austrailia",
            "Armenia",
            "Korea",
            4
        )
        questionList.add(que5)

        return  questionList
    }
}