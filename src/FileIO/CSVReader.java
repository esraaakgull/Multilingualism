package FileIO;

import Classes.Language;
import Classes.Questions.Contents.StringContent;
import Classes.Questions.Reading;
import Classes.User;
import Factory.LanguageFactory;
import Factory.UserFactory;
import utils.Randomizer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CSVReader {
    private final String languagesPath;
    private final String usersPath;
    private final BufferedReader languagesReader;
    private final BufferedReader usersReader;

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
                System.out.println(languageAndLine[0]);
                String[] units = languageAndLine[1].split("UNIT[1-9][0-9]*");
                for (int i = 1; i < units.length; i++) {
                    System.out.println("UNIT" + i + " " + units[i]);
                    String[] unitContents = units[i].split("QUIZ[1-9][0-9]*");
                    for (int j = 1; j < unitContents.length; j++) {
                        System.out.println("QUIZ" + j + " " + unitContents[j].split(",")[1]);
                        String[] quizQuestions = unitContents[j].split(",")[1].split(":");
                        for (String question : quizQuestions) {
                            //todo burada language oluştur, sırayla soru, sonra quiz, unit ve language
                        }
                    }
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
