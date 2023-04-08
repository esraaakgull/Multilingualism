package Classes;


import java.util.Random;

public class User {
    String username;
    String password;
    int numberOfDaysInStreak;
    int numberOfQuizzes;
    int point;
    Language langChoice;
    Unit unit;


//    League league;

    public User(String username, String password){
        this.username = username;
        this.password = password;
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
