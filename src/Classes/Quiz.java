package Classes;
import java.util.Random;

public class Quiz {
    Integer quizNumber;
    Integer totalQuizPoints;

    Random rand = new Random();

    // where should we hold all questions for a quiz
    // Question[] questions;

    public Integer getQuizNumber() {
        return quizNumber;
    }

    public void setQuizNumber(Integer quizNumber) {
        this.quizNumber = quizNumber;
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
