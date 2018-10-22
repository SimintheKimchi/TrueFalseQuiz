package com.example.truefalsequiz;

import java.util.List;

public class Quiz extends TrueFalseActivity{
    int score;
    int currentQuestion;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(int currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public void nextQuestion() {
    }

    public boolean isThereAnotherQuestion() {

    }

    @Override
    public String toString() {
        return "Quiz{" +
                "score=" + score +
                ", currentQuestion=" + currentQuestion +
                '}';
    }
}
