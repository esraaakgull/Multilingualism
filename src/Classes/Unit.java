package Classes;

public class Unit {
    Integer unitNumber;
    Integer i = 0;
    Quiz[] quizzes;

    public Unit(Integer unitNum) {
        this.unitNumber = unitNum;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public Integer getNumberOfQuizzes() {
        return quizzes.length;
    }

    public Quiz[] getQuizzes() {
        return quizzes;
    }

    public void addQuizzes(Quiz quiz) {
        this.quizzes[i] = quiz;
        i++;
    }


}
