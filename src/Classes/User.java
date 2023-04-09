package Classes;


public class User {
    String username;
    String password;
    int numberOfDaysInStreak;
    int numberOfQuizzes;
    Integer unitProgression;
    int point;
    Language chosenLanguage;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getUnitProgression() {
        return unitProgression;
    }

    public void setUnitProgression(Integer unitProgression) {
        this.unitProgression = unitProgression;
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

    public void setNumberOfQuizzes(int numberOfQuizzes) {
        this.numberOfQuizzes = numberOfQuizzes;
    }

    public int getPoints() {
        return point;
    }

    public Language getChosenLanguage() {
        return chosenLanguage;
    }

    public void setChosenLanguage(Language chosenLanguage) {
        this.chosenLanguage = chosenLanguage;
    }

   public void startTakingQuizzes() {
        int totalPointsEarned = 0;
        int reducedQuizAmount = this.numberOfQuizzes;
        for (int i = 0; i < unitProgression; i++) {
            if (i == unitProgression - 1) {
                for (int j = 0; j<reducedQuizAmount; j++){
                    totalPointsEarned = chosenLanguage.getCollection().get(i).getCollection().get(j).solveQuiz();
                }
            } else {
                for (Quiz quiz : chosenLanguage.getCollection().get(i).getCollection()) {
                    totalPointsEarned += quiz.solveQuiz();
                    reducedQuizAmount--;
                }
            }
        }
        this.point = totalPointsEarned;
    }

}
