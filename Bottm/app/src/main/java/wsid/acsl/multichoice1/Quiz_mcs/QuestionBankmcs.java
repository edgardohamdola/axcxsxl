package wsid.acsl.multichoice1.Quiz_mcs;

// This file contains questions from QuestionBank

public class QuestionBankmcs {

    // array of questions
    private String textQuestionsmcs [] = {
            "1. Android adalah Sistem Operasi berbasis Linux/Open Source yang menjalan kan sebuah aplikasi dari kombinasi bahasa Pemrograman ?",
            "2.  Layout pada Android merupakan Layar yang mennggambarkan tampilan. Bahasa yang digunakan pada Layout Android adalah?",
            "3.  Sedangkan Activity merupakan kode yang menjalankan Android. Bahasa yang digunakan pada Activity Android adalah?",
            "4. Tipe data yang termasuk tipe data primitive pada Java adalah ?",
            "5. Keyword yang digunakan untuk membuat nilai tetap dan tidak dapat berubah pada konsep OOP adalah ?",
            "6.  IDE (Integrated Development Environment) atau Editor Pemrograman Android yang  bisa digunakan adalah?",
            "7. Sebelum kita memasang IDE Android berbasis Java maka yang harus dilakukan adalah memasang ?",
            "8. Versi 4.3 dengan API level 18 merupakan Android dengan Kode Nama?",
            "9. Versi 4.4 dengan API level 20 merupakan Android dengan Kode Nama ?",
            "10. Versi 5.0 dengan API level 21 merupakan Android dengan Kode Nama?"
    };

    // array of multiple choices for each question
    private String multipleChoicemcs [][] = {
            {
                    "C++ dan XML",  "XML dan Java" ,

                    "Java dan C++" , "Java dan PHP"
            },

            {
                    "Java" , "XML",

                    "C++" , "PHP"
            },

            {
                   "Java" , "XML",

                    "C++" , "PHP"
            },

            {
                    "Byte"  ,"Boolean" ,

                    "Double" , "Character"
            },
            {
                    "Private" , "Public"  ,

                    "Final" ,"Protected"
            },
            {
                    "Eclipse" , "Visual Studio 2015"  ,

                    "Android Studio" , "Semua benar kecuali jawaban c"
            },
            {
                    "Java Development Kit" , "Java 2 Micro Edition" ,

                    "Java Runtime Environtment", "Semua benar "
            },
            {
                    "Jelly Bean" , "Kitkat"  ,

                    "Ice cream sandwich",  "Lollipop"
            },
            {
                    "Jelly Bean" , "Kitkat"  ,

                    "Ice cream sandwich",  "Lollipop"
            },
            {
                    "Jelly Bean" , "Kitkat"  ,

                    "Ice cream sandwich",  "Lollipop"
            },
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswersmcs[] = {
            "XML dan Java",
            "XML",
            "Java",
            "Character",
            "Private",
            "Semua benar kecuali jawaban c",
            "Java Development Kit",
            "Jelly Bean",
            "Kitkat",
            "Lollipop"

    };

    // method returns number of questions
    public int getLength(){
        return textQuestionsmcs.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestionsmcs[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoicemcs[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswersmcs[a];
        return answer;
    }
}