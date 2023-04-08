package Classes;

import AbstractClasses.AQuestion;
import Classes.Questions.Listening;
import Classes.Questions.Reading;
import Classes.Questions.Speaking;
import Classes.Questions.WordMatching;

import java.util.Random;

public class Quiz {
    Integer quizNumber;
    Integer totalQuizPoints;

    AQuestion[] questions;
    Random rand = new Random();

    public Quiz(Integer quizNumber, AQuestion[] question) {
        this.quizNumber = quizNumber;
        this.questions = question;
    }

    public Integer getQuizNumber() {
        return quizNumber;
    }

    public Integer getTotalQuizPoints() {
        return totalQuizPoints;
    }

    public void setTotalQuizPoints(Integer totalQuizPoints) {
        this.totalQuizPoints = totalQuizPoints;
    }

    void startQuiz() {
        // will take number of questions in each type
        // according to number of question, number of correct question will be generated randomly
        int numberOfCorrectQuestion = rand.nextInt(0, 10);
        // here should be a loop for correct questions

    }

    void endQuiz() {
        setTotalQuizPoints(calcTotalPoints());
    }

    // according to correct number of question and type total point will be calculated
    int calcTotalPoints() {
        return 0;
    }
}
