import Factory.LanguageFactory;
import Factory.UserFactory;
import FileIO.CSVReader;
import FileIO.CSVWriter;
import utils.Sorter;

import java.io.File;
import java.io.IOException;

public class Main {
    static final String bookPath = "src/assets/languages.csv";
    static final String usersPath = "src/assets/users.csv";

    static Sorter sorter = new Sorter();
    static UserFactory userFactory = new UserFactory();
    static LanguageFactory languageFactory = new LanguageFactory();
    static QueriesManager queriesManager = new QueriesManager(languageFactory, userFactory);

    public static void main(String[] args) {
        try {
            File file = new File(bookPath);
            if (file.createNewFile()) {
                System.out.println("File created.");
                CSVWriter writer = new CSVWriter(bookPath);
                writer.publish();
            }
            System.out.println("Reading files.");
            CSVReader reader = new CSVReader(bookPath, usersPath, sorter);
            reader.ParseLanguageCSV(languageFactory);
            reader.ParseUsersCSV(languageFactory, userFactory);
            queriesManager.printUserWithMaxPoints();
            queriesManager.printUserWithMaxProgression("German",sorter);
            queriesManager.printLanguageWithMaxUnitAmount();
            queriesManager.printLanguageWithMaxQuizAmount();
            queriesManager.printTopUsersInLeague(languageFactory.getCollection().get("Italian"), languageFactory.getCollection().get("Italian").getLeague("Silver"), 3);
            // Since Silver leagues turn out to be empty most of the time, we also queried Ruby of Spanish
            queriesManager.printTopUsersInLeague(languageFactory.getCollection().get("Spanish"), languageFactory.getCollection().get("Spanish").getLeague("Ruby"), 3);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}