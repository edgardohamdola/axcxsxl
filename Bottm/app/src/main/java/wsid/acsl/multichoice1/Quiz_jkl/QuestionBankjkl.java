package wsid.acsl.multichoice1.Quiz_jkl;

// This file contains questions from QuestionBank

public class QuestionBankjkl {

    // array of questions
    private String textQuestionsjkl [] = {
            "1. Di bawah ini yang termasuk system operasi berbasis GUI  kecuali ?",
            "2. Di bawah ini adalah jenis-jenis sistem operasi, kecuali?",
            "3. Sebuah jaringan computer dengan jumlah computer 43 maka memiliki subnet mask yang digunakan?",
            "4. Panjang Net id pada kelas A",
            "5. Panjang Host ID pada kelas B",
            "6. Perintah untuk mengetahui jalur / rute suatu domain komputer / website mengguna-kan pada system Linux adalah?",
            "7. Perangkat keras yang digunakan untuk menyatukan kabel-kabel network dari tiap-tiap workstation atau perangkat lainnya dalam jaringan disebut?",
            "8. Topologi jaringan komputer yang menggunakan BNC (T) sebagai konektornya adalah ?",
            "9. Salah satu keuntungan jaringan komputer menggunakan topologi bus adalah ?",
            "10. Agar penggunaan kabel coaxial jenis thinnet optimal maka setiap ujung harus diterminasi   dengan?"
    };

    // array of multiple choices for each question
    private String multipleChoicejkl [][] = {
            {
                    "Mickrotik",
                    "Apple",
                    "Macintosh",
                          "Windows"
            },

            {
                    "Ubuntu",
                           "Windows XP",
                           "Mac OS",
                          "Cytrix"
            },

            {
                    "255.255.255.0",
                    "255.255.255.24",
                        "255.255.255.192",
                    "255.255.255.250"
            },

            {
                    "8 bit",
                    "16 bit",
                    "24 bit",
                    "64 bit"
            },
            {
                    "8 bit",
                    "16 bit",
                    "24 bit",
                        "64 bit"
            },
            {
                    "Ping",
                    "Traceroute",
                    "Tracert",
                    "Ipconfig"
            },
            {"Concentrator",
                    "Lan Card",
                    "Modem",
                    "USB"
            },
            {
                    "Topologi Bus",
                    "Topologi Coaxial",
                    "Topologi Ring",
                    "Topologi Star,"
            },
            {
                    "Deteksi dan isolasi kesalahan sangat kecil",
                    "Pengembangan jaringan atau penambahan workstation baru dapat dilakukan dengan mudah tanpa menggangu workstation lain.",
                    "Kepadatan lalu lintas pada jalur utama",
                    "Diperlukan repeater untuk jarak jauh"
            },
            {
                    "Pembungkus kaber (isolator)",
                    "T-Connector 0,5 meter",
                    "Terminator 50-ohm",
                    "Terminator 500-ohm"
            },

    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswersjkl[] = {
            "Mickrotik",
            "Cytrix",
            "255.255.255.192",
            "8 bit",
            "16 bit",
            "Tracert",
            "Concentrator",
            "Topologi Bus",
            "Kepadatan lalu lintas pada jalur utama",
            "Terminator 50-ohm"

    };

    // method returns number of questions
    public int getLength(){
        return textQuestionsjkl.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestionsjkl[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoicejkl[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswersjkl[a];
        return answer;
    }
}