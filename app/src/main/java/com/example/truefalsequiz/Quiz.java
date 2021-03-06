package com.example.truefalsequiz;

import java.util.List;

public class Quiz {
    private int score;
    private int currentQ;

    private List<Question> questions;

    public Quiz(List<Question> questionList){
        score = 0;
        currentQ= 0;
        questions = questionList;
    }

    public Question getQuestion(){
        return questions.get(currentQ);
    }

    public int getQuizLength(){
        return questions.size();
    }

    public void setQuestions(List<Question> questionList){
        questions = questionList;
    }

    public int getScore(){
        return score;
    }

    public void increaseScore(){
        score++;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getCurrentQ() {
        return currentQ;
    }

    public void setCurrentQ(int currentQ) {
        this.currentQ = currentQ;
    }

    public void nextQuestion(){
        currentQ+=1;
    }

    public boolean isThereAnotherQ(){
        if(getCurrentQ()==10){
            return false;
        }
        else{
            return true;
        }
    }
}
