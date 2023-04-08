package FileIO;

import AbstractClasses.AQuestion;
import Factory.LanguageFactory;
import Factory.UserFactory;

import java.io.IOException;  // Import the IOException class to handle errors

import Classes.Language;

import Classes.Quiz;
import Classes.Unit;
import utils.Randomizer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVReader {
    private final String languagesPath;
    private final String usersPath;
    private final BufferedReader languagesReader;
    private final BufferedReader usersReader;

    public Language[] generatedLanguages;

    //    private final Matcher matcher = Pattern.compile();
    public CSVReader(String languagesPath, String usersPath) throws FileNotFoundException {
        this.languagesPath = languagesPath;
        this.usersPath = usersPath;
        this.languagesReader = new BufferedReader(new FileReader(this.languagesPath));
        this.usersReader = new BufferedReader(new FileReader(this.usersPath));
    }

    public void ParseLanguageCSV(LanguageFactory languageFactory) throws IOException {
        while (true) {
            String line = languagesReader.readLine();
            if (line != null) {
                String[] languageAndLine = line.split(",", 2);
                // Language object initialization
                Language language = new Language(languageAndLine[0]);
                System.out.println(languageAndLine[0]);
                String[] unitNums = languageAndLine[1].split("UNIT[1-9][0-9]*");
                ArrayList<Unit> units = new ArrayList<>();
                for (int i = 1; i < unitNums.length; i++) {
                    // Unit object initialization
//                    Unit unit = new Unit(i);
                    System.out.println("UNIT" + i + " " + unitNums[i]);
                    ArrayList<Quiz> quizzes = new ArrayList<>();
                    String[] unitContents = unitNums[i].split("QUIZ[1-9][0-9]*");
                    for (int j = 1; j < unitContents.length; j++) {
//                        System.out.println("QUIZ" + j + " " + unitContents[j].split(",")[1]);
                        String[] quizQuestions = unitContents[j].split(",")[1].split(":");
                        ArrayList<AQuestion> questions = new ArrayList<>();
                        for (String question : quizQuestions) {
                            int numberOfQuestion = Integer.parseInt(question.substring(0, question.length() - 1));
                            // if it is Reading Question
                            if (question.charAt(question.length() - 1) == 'R') {
                                for (int x = 0; x < numberOfQuestion; x++) {
                                    questions.add(languageFactory.generateReadingQ());
                                }
                            }
                            // if it is Listening Question
                            if (question.charAt(question.length() - 1) == 'L') {
                                for (int x = 0; x < numberOfQuestion; x++) {
                                    questions.add(languageFactory.generateListeningQ());
                                }
                            }
                            // if it is Speaking Question
                            if (question.charAt(question.length() - 1) == 'S') {
                                for (int x = 0; x < numberOfQuestion; x++) {
                                    questions.add(languageFactory.generateSpeakingQ());
                                }
                            }
                            // if it is Word Matching Question
                            if (question.charAt(question.length() - 1) == 'W') {
                                for (int x = 0; x < numberOfQuestion; x++) {
                                    questions.add(languageFactory.generateWordMatchingQ());
                                }
                            }
                        }
                        Quiz quiz = new Quiz(j, questions);
                        quizzes.add(quiz);
                    }
                    Unit unit= new Unit(i, unitNums);
                    units.add(unit);
                }
            } else {
                System.out.println("All the lines have been read.");
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
                userFactory.Generate(userValues);
                randomizer.generateLangChoice(languages);
            } else {
                System.out.println("All the lines have been read.");
                break;
            }
        }
    }
}
