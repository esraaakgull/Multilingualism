package Classes;


public class User {
    private String username;
    private String password;
    private int numberOfDaysInStreak;
    private int numberOfQuizzes;
    private int point;
    private Language langChoice;
    private Unit unit;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getPoint() {
        return point;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public int getNumberOfDaysInStreak() {
        return numberOfDaysInStreak;
    }

    public int getNumberOfQuizzes() {
        return numberOfQuizzes;
    }

    public int getPoints() {
        return point;
    }

    public Language getLangChoice() {
        return langChoice;
    }

    public Unit getUnit() {
        return unit;
    }

    void endQuiz() {
    }

    void answerTheQuestions() {
    }

    void startTakingQuiz(Language langChoice) {
    }

}
