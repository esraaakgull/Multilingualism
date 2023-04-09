package Classes;

import AbstractClasses.AQuestion;
import Factory.ICollection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Quiz implements IParentOf<AQuestion>, ICollection<ArrayList<AQuestion>> {
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

    int solveQuiz() {
        int pointsEarned = 0;
        for (AQuestion question : questions) {
            if (rand.nextBoolean()) {
                pointsEarned += question.getQuestionPoint();
            }
        }
        return pointsEarned;
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

    @Override
    public ArrayList<AQuestion> getCollection() {
        return this.questions;
    }
}
