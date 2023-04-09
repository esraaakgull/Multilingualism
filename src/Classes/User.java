package Classes;


public class User {
    String username;
    String password;
    int numberOfDaysInStreak;
    int numberOfQuizzes;
    int unitProgression;
    int point;
    Language chosenLanguage;
    Unit unit;

    public int getUnitProgression() {
        return unitProgression;
    }

    public void setUnitProgression(int unitProgression) {
        this.unitProgression = unitProgression;
    }




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

    public void setNumberOfDaysInStreak(int numberOfDaysInStreak) {
        this.numberOfDaysInStreak = numberOfDaysInStreak;
    }

    public int getNumberOfQuizzes() {
        return numberOfQuizzes;
    }
    public void setNumberOfQuizzes(int numberOfQuizzes){
        this.numberOfQuizzes = numberOfQuizzes;
    }
    public int getPoints() {
        return point;
    }
    public Language getChosenLanguage() {
        return chosenLanguage;
    }
    public void setChosenLanguage(Language chosenLanguage){
        this.chosenLanguage = chosenLanguage;
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
