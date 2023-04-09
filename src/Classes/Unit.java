package Classes;

import Classes.Questions.IParentOf;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Unit implements IParentOf<Quiz> {
    Integer unitNumber;
    ArrayList<Quiz> quizzes = new ArrayList<>();

    public Unit(Integer unitNum) {
        this.unitNumber = unitNum;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public Integer getNumberOfQuizzes() {
        return quizzes.size();
    }

    public ArrayList<Quiz> getQuizzes() {
        return quizzes;
    }

//    public void addQuiz(Quiz quiz) {
//        this.quizzes.add(quiz);
//    }

    public void addQuiz(Quiz quiz){
        this.quizzes.add(quiz);
    }

//    public void setQuizzes(ArrayList<Quiz> quizArr){
//        this.quizzes = quizArr.toArray(new Quiz[0]);
//    }


    @Override
    public void addChildToArray(Quiz child) {
        this.quizzes.add(child);
    }
}
