package wsid.acsl.multichoice1.Quiz_fpga;

// This file contains questions from QuestionBank

public class QuestionBankfpga {

    // array of questions
    private String textQuestionsfpga [] = {
            "1. seven segmen display biasa tersusun atas 7 bagian yang setiap bagiannya adalah?",
            "2. jenis seven segmen display ada 2 adalah?",
            "3. perangkat layar untuk menampilkan sistem angka desimal adalah?",
            "4. LED akronimnya adalah",
            "5. LCD akronimnya adalah",
            "6. yang merupakan jenis seven segmen ??",
            "7. pada tahun berapa seven segmen mulai dikenal luas?",
            "8. seven segmen diperkenalkan dan dipatenkan oleh\n?",
            "9. seven segmen common cathoda aktif ketika kondisinya ?\n",
            "10. seven segmen common anoda aktif ketika kondisinya ?\n"
    };

    // array of multiple choices for each question
    private String multipleChoicefpga [][] = {
            {"seven segmen"	,"polling"	,"LCD"	,"interupt"},
            {"cathode dan anode"	,"decoder dan encoder"	,"multiplekser dan demulatiplekser"	,"common cathoda dan common anoda"
            },
            {"seven segment",	"fiber segmen"	,"nano segmen" ,"lcd	eight segmen"
            },
            {"list emitting diode",	"light emitting diode" ,	"light emulator diode"	,"list emulator deode"
            },
            {"liquid core display"	,"light crystal display"	,"liquid crystal display"	,"semua salah"
            },
            {"incandescent bulbs",	"Light Emitting Diode (LED)"	,"Fluorescent lamps" ,	"benar semua"
            },
            {"1950-an"	,"1960-an"	,"1970-an"	,"salah semua"
            },
            {"frank. w. wood"	,"thomas alfa edison",	"linus torvalds"	,"charles babbage"
            },
            {"low (0)",	"high (1)",	"a dan b benar"	,"a dan b salah"
            },
            {"low (0)"	,"high (1)"	,"a dan b benar"	,"a dan b salah"
            },
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswersfpga[] = {
            "LCD",
            "common cathoda dan common anoda",
            "seven segment",
            "light emitting diode",
            "liquid crystal display",
            "benar semua",
            "1970-an",
            "frank. w. wood",
            "high (1)",
            "low (0)"

    };

    // method returns number of questions
    public int getLength(){
        return textQuestionsfpga.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestionsfpga[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoicefpga[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswersfpga[a];
        return answer;
    }
}