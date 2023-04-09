import Classes.LanguageBook.Language;
import Classes.Leagues.ALeague;
import Classes.User;
import Factory.LanguageFactory;
import Factory.UserFactory;
import utils.Sorter;

import java.util.ArrayList;

public class QueriesManager {
    private final LanguageFactory languageFactory;
    private final UserFactory userFactory;

    private int queryCounter = 1;

    QueriesManager(LanguageFactory languageFactory, UserFactory userFactory) {
        this.languageFactory = languageFactory;
        this.userFactory = userFactory;
    }

    public void printUserWithMaxPoints() {
        User userWithMaxPoints = null;
        for (Language language : languageFactory.getCollection().values()) {
            if (userWithMaxPoints == null) {
                userWithMaxPoints = language.getUserWithMaxPoints();
            } else if (userWithMaxPoints.getPoints() < language.getUserWithMaxPoints().getPoints()) {
                userWithMaxPoints = language.getUserWithMaxPoints();
            }
        }
        System.out.println(queryCounter + "- User with max points: " + userWithMaxPoints.getUsername() + " " + userWithMaxPoints.getPoints());
        this.queryCounter++;
    }

    public void printUserWithMaxProgression(String languageName, Sorter sorter) {
        ArrayList<User> usersWithMaxProgression = languageFactory.getCollection().get(languageName).getUserWithMaxProgression(sorter);
        for (User user : usersWithMaxProgression){
            System.out.print(queryCounter + "- Most progressed user in " + languageName + ": " + user.getUsername() + " " + user.getUnitProgression() + " Units \t");
        }
        System.out.println();
        this.queryCounter++;
    }

    public void printLanguageWithMaxUnitAmount() {
        Language languageWithMaxUnitAmount = null;
        for (Language language : languageFactory.getCollection().values()){
            if (languageWithMaxUnitAmount == null){
                languageWithMaxUnitAmount = language;
            } else if(languageWithMaxUnitAmount.getTotalUnitAmount() < language.getTotalUnitAmount()){
                languageWithMaxUnitAmount = language;
            }
        }
        System.out.println(queryCounter + "- Language which has the maximum number of units: " +
                languageWithMaxUnitAmount.getName() +
                " " +
                languageWithMaxUnitAmount.getTotalUnitAmount() +
                " Units");
        this.queryCounter++;
    }

    public void printLanguageWithMaxQuizAmount() {
        Language languageWithMaxQuizAmount = null;
        for (Language language : languageFactory.getCollection().values()){
            if (languageWithMaxQuizAmount == null){
                languageWithMaxQuizAmount = language;
            } else if(languageWithMaxQuizAmount.getTotalQuizAmount() < language.getTotalQuizAmount()){
                languageWithMaxQuizAmount = language;
            }
        }

        System.out.println(queryCounter + "- Language which has the maximum number of quizzes: " +
                languageWithMaxQuizAmount.getName() +
                " " +
                languageWithMaxQuizAmount.getTotalQuizAmount() +
                " Quizzes");
        this.queryCounter++;
    }

    public void printTopUsersInLeague(Language language, ALeague league, int amount) throws Exception {
        System.out.println(queryCounter + "- Top " + amount + " users in " + league.getLeagueName() + " league of " + language.getName() + ": " + language.getLeague(league.getLeagueName()).getTopUsers(amount));
        this.queryCounter++;
    }
}
