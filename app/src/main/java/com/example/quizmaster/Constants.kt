package com.example.quizmaster

object Constants {

    const val USER_NAME: String ="user_name"
    const val TOTAL_QUESTIONS: String ="total_questions"
    const val CORRECT_ANSWERS: String ="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //1
        val que1 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_argentina,
            "Austria","Argentina","Armenia","Australia",
            1
        )
        questionList.add(que1)

        return questionList

        //2
       val que2 = Question(
           2,"What country does this flag belong to ?",
           R.drawable.ic_flag_of_australia,
           "Austria","Argentina","Australia", "Armenia",
           1

       )
        questionList.add(que2)

        return  questionList

        //3
        val que3 = Question(
           3,"What country does this flag belong to ?",
           R.drawable.ic_flag_of_belgium,
           "Austria","Belgium","Australia", "Armenia",
           1

       )
        questionList.add(que3)

        return  questionList

        //4
        val que4 = Question(
           4,"What country does this flag belong to ?",
           R.drawable.ic_flag_of_brazil,
           "Brazil","Argentina","Australia", "Armenia",
           1

       )
        questionList.add(que4)

        return  questionList

        //5
        val que5 = Question(
           5,"What country does this flag belong to ?",
           R.drawable.ic_flag_of_denmark,
           "Austria","Argentina","Denmark", "Armenia",
           1

       )
        questionList.add(que5)

        return  questionList

        //6
        val que6 = Question(
           6,"What country does this flag belong to ?",
           R.drawable.ic_flag_of_fiji,
           "Fiji","Argentina","Australia", "Armenia",
           1

       )
        questionList.add(que6)

        return  questionList

        //7
        val que7 = Question(
           7,"What country does this flag belong to ?",
           R.drawable.ic_flag_of_germany,
           "Austria","Germany","Australia", "Armenia",
           1

       )
        questionList.add(que7)

        return  questionList

        //8
        val que8 = Question(
           8,"What country does this flag belong to ?",
           R.drawable.ic_flag_of_india,
           "Austria","Argentina","Australia", "India",
           1

       )
        questionList.add(que8)

        return  questionList

        //9
        val que9 = Question(
           9,"What country does this flag belong to ?",
           R.drawable.ic_flag_of_kuwait,
           "Kuwait","Argentina","Australia", "Armenia",
           1

       )
        questionList.add(que9)

        return  questionList

        //10
        val que10 = Question(
           10,"What country does this flag belong to ?",
           R.drawable.ic_flag_of_new_zealand,
           "Austria","Argentina","New Zealand", "Armenia",
           1

       )
        questionList.add(que10)


    }
}