package Classes.LanguageBook;

import Classes.Questions.AQuestion;
import Factory.ICollection;
import utils.Randomizer;

import java.util.ArrayList;

public class Quiz implements IParentOf<AQuestion>, ICollection<ArrayList<AQuestion>> {
    Integer quizNumber;
    Integer totalQuizPoints;

    ArrayList<AQuestion> questions = new ArrayList<>();

    public Quiz(Integer quizNumber) {
        this.quizNumber = quizNumber;
    }

    public Integer getQuizNumber() {
        return quizNumber;
    }

    public Integer getTotalQuizPoints() {
        return totalQuizPoints;
    }

    public int solveQuiz(Randomizer randomizer) {
        int pointsEarned = 0;
        for (AQuestion question : questions) {
            if (randomizer.coinFlip()) {
                pointsEarned += question.getQuestionPoint();
            }
        }
        return pointsEarned;
    }

    @Override
    public void addChildToArray(AQuestion child) {
        this.questions.add(child);
    }

    @Override
    public ArrayList<AQuestion> getCollection() {
        return this.questions;
    }
}
