package Classes;

import AbstractClasses.AQuestion;
import Classes.Questions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Quiz implements IParentOf<AQuestion> {
    Integer quizNumber;
    Integer totalQuizPoints;

    ArrayList<AQuestion> questions = new ArrayList<>();
    Random rand = new Random();

    public Quiz(Integer quizNumber) {
        this.quizNumber = quizNumber;
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

//    public void setQuestions(ArrayList<AQuestion> questionsArr){
//        this.questions = questionsArr.toArray(new AQuestion[0]);
//    }

    @Override
    public void addChildToArray(AQuestion child) {
        this.questions.add(child);
    }
}
