package Classes.LanguageBook;

import Factory.ICollection;

import java.util.ArrayList;

public class Unit implements IParentOf<Quiz>, ICollection<ArrayList<Quiz>> {
    private Integer unitNumber;
    private ArrayList<Quiz> quizzes = new ArrayList<>();

    public Unit(Integer unitNum) {
        this.unitNumber = unitNum;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public Integer getNumberOfQuizzes() {
        return quizzes.size();
    }

    @Override
    public void addChildToArray(Quiz child) {
        this.quizzes.add(child);
    }

    @Override
    public ArrayList<Quiz> getCollection() {
        return this.quizzes;
    }
}
