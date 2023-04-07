package Classes;

public class Unit {
    Integer unitNumber;
    Integer numberOfQuizzes;
    Quiz[] quizzes;

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Integer getNumberOfQuizzes() {
        return numberOfQuizzes;
    }

    public void setNumberOfQuizzes(Integer numberOfQuizzes) {
        this.numberOfQuizzes = numberOfQuizzes;
    }

    public Quiz[] getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(Quiz[] quizzes) {
        this.quizzes = quizzes;
    }


}
