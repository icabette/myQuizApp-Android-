package net.kimsang.myquizapp

object Constants {
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
            1
        )
        questionList.add(que5)

        return  questionList
    }
}