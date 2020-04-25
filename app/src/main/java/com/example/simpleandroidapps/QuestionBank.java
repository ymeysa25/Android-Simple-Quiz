package com.example.simpleandroidapps;

public class QuestionBank {
    private String[] textquestion = {"1. Apa warna bendera indonesia?",
            "2. Siapa presideng pertama indonesia?",
            "3. Siapa presiden indonesia sekarang?",
            "4. Kapan indonesia merdeka?"};

    private  String[][] multiplechoice = {
            {"Merah Putih", "putih - merah","kuning","Hijau"},
            {"Soeharto","Soekarno","Jokowi","SBY"},
            {"Soeharto","Soekarno","Jokowi","SBY"},
            {"1998","2020","1945","1892"}
        };

    private String mcorrectanswer [] = {"Merah Putih", "Soekarno", "Jokowi", "1945" };

    public int getLength(){
        return  textquestion.length;
    }

    public String getQuestion(int a){
        String question = textquestion[a];
        return question;
    }

    public String getChoice(int index, int num){
        String choice0 = multiplechoice[index][num - 1];
        return choice0;
    }

    public String getCorrectanswer(int a){
        String answer =  mcorrectanswer[a];
        return answer;
    }


}
