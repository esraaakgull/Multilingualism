package FileIO;

import Classes.User;
import Factory.LanguageFactory;
import Factory.UserFactory;

import java.io.IOException;

import Classes.LanguageBook.Language;

import Classes.LanguageBook.Quiz;
import Classes.LanguageBook.Unit;
import utils.Randomizer;
import utils.Sorter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CSVReader {
    private final String languagesPath;
    private final String usersPath;
    private final BufferedReader languagesReader;
    private final BufferedReader usersReader;
    private final Sorter sorter;

    public CSVReader(String languagesPath, String usersPath, Sorter sorter) throws FileNotFoundException {
        this.languagesPath = languagesPath;
        this.usersPath = usersPath;
        this.languagesReader = new BufferedReader(new FileReader(this.languagesPath));
        this.usersReader = new BufferedReader(new FileReader(this.usersPath));
        this.sorter = sorter;
    }

    public void ParseLanguageCSV(LanguageFactory languageFactory) throws IOException {
        while (true) {
            String line = languagesReader.readLine();
            if (line != null) {
                String[] languageSplit = line.split(",", 2);
                // Language object initialization
                Language language = new Language(languageSplit[0]);
                String[] unitSplit = languageSplit[1].split("UNIT[1-9][0-9]*");

                for (int i = 1; i < unitSplit.length; i++) {

                    String[] quizSplit = unitSplit[i].split("QUIZ[1-9][0-9]*");
                    Unit unit = new Unit(i);
                    for (int j = 1; j < quizSplit.length; j++) {
                        String[] questionSplit = quizSplit[j].split(",")[1].split(":");
                        Quiz quiz = new Quiz(j);

                        for (String question : questionSplit) {
                            int numberOfQuestion = Integer.parseInt(question.substring(0, question.length() - 1));
                            // if it is Reading Question
                            if (question.charAt(question.length() - 1) == 'R') {
                                for (int x = 0; x < numberOfQuestion; x++) {
                                    quiz.addChildToArray((languageFactory.generateReadingQ()));
                                }
                            }
                            // if it is Listening Question
                            if (question.charAt(question.length() - 1) == 'L') {
                                for (int x = 0; x < numberOfQuestion; x++) {
                                    quiz.addChildToArray(languageFactory.generateListeningQ());
                                }
                            }
                            // if it is Speaking Question
                            if (question.charAt(question.length() - 1) == 'S') {
                                for (int x = 0; x < numberOfQuestion; x++) {
                                    quiz.addChildToArray(languageFactory.generateSpeakingQ());
                                }
                            }
                            // if it is Word Matching Question
                            if (question.charAt(question.length() - 1) == 'W') {
                                for (int x = 0; x < numberOfQuestion; x++) {
                                    quiz.addChildToArray(languageFactory.generateWordMatchingQ());
                                }
                            }
                        }
                        unit.addChildToArray(quiz);
                    }
                    language.addChildToArray(unit);
                }
                languageFactory.addToFactory(language);
            } else {
                System.out.println("Languages file has been read.");
                break;
            }
        }
    }

    public void ParseUsersCSV(LanguageFactory languageFactory, UserFactory userFactory) throws IOException {
        Randomizer randomizer = new Randomizer();
        Language[] languages = languageFactory.getCollection().values().toArray(new Language[0]);
        while (true) {
            String line = usersReader.readLine();
            if (line != null) {
                String[] userValues = line.split(";"); //index 0 = username, index 1 = password
                User user = new User(userValues[0], userValues[1]);

                Language languageChoiceOfUser = randomizer.generateLangChoice(languages);
                int streakOfUser = randomizer.generateNumberOfDaysInStreak();
                int takenQuizAmount = randomizer.generateTakenQuizAmount(languageChoiceOfUser);

                user.setChosenLanguage(languageChoiceOfUser);
                languageChoiceOfUser.addUser(user);
                user.setNumberOfDaysInStreak(streakOfUser);
                user.setNumberOfQuizzes(takenQuizAmount);
                user.setUnitProgression(languageChoiceOfUser.findUnitProgression(takenQuizAmount));
                user.startTakingQuizzes(randomizer);

                userFactory.addToFactory(user);

            } else {
                for (Language language : languageFactory.getCollection().values()){
                    sorter.sortArraylist(language.users);
                    language.assignUsersToLeagues();
                    language.sortLeagues(sorter);
                }
                System.out.println("Users file has been read.");
                break;
            }
        }
    }
}
