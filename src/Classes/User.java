package Classes;


import java.util.Random;

public class User {
    String username;
    String password;
    Integer numberOfDaysInStreak;
    Integer numberOfQuizzes;
    Integer point;
    Language langChoice;
    Unit unit;

    Random random = new Random();

//    League league;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getNumberOfDaysInStreak() {
        return numberOfDaysInStreak;
    }

    public void setNumberOfDaysInStreak(Integer numberOfDaysInStreak) {
        this.numberOfDaysInStreak = numberOfDaysInStreak;
    }

    public Integer getNumberOfQuizzes() {
        return numberOfQuizzes;
    }

    public void setNumberOfQuizzes(Integer numberOfQuizzes) {
        this.numberOfQuizzes = numberOfQuizzes;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Language getLangChoice() {
        return langChoice;
    }

    public void setLangChoice(Language langChoice) {
        this.langChoice = langChoice;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }


    void endQuiz() {
    }

    void answerTheQuestions() {
    }

    void startTakingQuiz(Language langChoice) {
    }

    void generateNumberOfDaysInStreak() {
        int randomNumber = random.nextInt(0,366);
        setNumberOfDaysInStreak(randomNumber);
    }

    // randomly language choice will be here
    void chooseLanguage() {
        // here language choice should be set
//        setLangChoice();
    }

    // here pull username and password and set them
    void readUserData() {
        setUsername("something");
        setPassword("something");
    }

    void createUserData(){
        readUserData();
        chooseLanguage();
        generateNumberOfDaysInStreak();
    }

}
