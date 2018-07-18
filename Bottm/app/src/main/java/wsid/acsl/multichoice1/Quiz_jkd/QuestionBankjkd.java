package wsid.acsl.multichoice1.Quiz_jkd;

// This file contains questions from QuestionBank

public class QuestionBankjkd {

    // array of questions
    private String textQuestionsjkd [] = {
            "1. Sebuah alamat pada komputer agar komputer bisa saling terhubung dengan komputer lain disebut dengan ?",
            "2. IPv 4 Terdiri dari?",
            "3. IPv4 terdiri dari berapa Byte dan bit?",
            "4. Notasi untuk IPv4 disebut dengan",
            "5. Suatu cara / metode yang digunakan membagi sebuah network menjadi beberapa subnetwork disebut  dengan",
            "6. IPv4 terdiri dari berapa blok?",
            "7. Penulisan IP Address versi 4 di bawah ini yang benar adalah?",
            "8. IPv4 Terdiri dari berapa kelas?",
            "9. Pada jaringan komputer yang menggunakan IPv4, kelas yang bisa digunakan antara lain ?",
            "10. Beberapa IP Address yang tidak boleh dipakai, kecuali?"
    };

    // array of multiple choices for each question
    private String multipleChoicejkd [][] = {
            {"IP Address" ,  "Broadcast Address" ,"Netmask/Subnet Mask" ,"Gateway"},

            { "Net ID & Host ID", "Kode Vendor & Kode Hardware", "Broadcast & Netmask","FLSM & VLSM"
            },

            {"40 bit & 32 Byte" ,"48 Byte & 6 bit" ,"4 Byte & 32 bit", "32 Byte & 4 bit"
            },

            {
                    "Dotted Decimal Notation",
                    "Colon Hexa Decimal Notation",
                          "Semi Colon Equal Decimal",
                         "Dot Octal Notation"
            },
            {
                    "Subnetting",
                          "Subnet Mask",
                           "Broadcast",
                          "Dotted Decimal Notation"
            },
            {
                    "5Blok" ,"4 Blok" ,"3 Blok","2 Blok"
            },
            {
                    "129.129.130.1",
                         "223.45.2.256",
                          "192.168.255.255",
                         "255.255.0.0"
            },
            {
                    "4 Kelas",
                    "2 Kelas",
                    "6 Kelas",
                    "5 kelas"
            },
            {
                       "A, B dan C",   "A, B dan D",
                         "B, C",
                        "A, B, C dan D"
            },

            {
                    "Broadcast",
                    "Loopback Address",
                   "Subnet Mask",
                    "Range Host yang valid"
            },
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswersjkd[] = {
            "IP Address",
            "Net ID & Host ID",
            "4 Byte & 32 bit",
            "Dotted Decimal Notation",
            "Subnetting",
            "4 Blok",
            "129.129.130.1",
            "5 kelas",
            "A, B dan C",
            "Range Host yang valid"

    };

    // method returns number of questions
    public int getLength(){
        return textQuestionsjkd.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestionsjkd[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoicejkd[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswersjkd[a];
        return answer;
    }
}