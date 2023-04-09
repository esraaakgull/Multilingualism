import Factory.LanguageFactory;
import Factory.UserFactory;
import FileIO.CSVReader;
import FileIO.CSVWriter;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Main {
    static final String bookPath = "src/assets/languages.csv";
    static final String usersPath = "src/assets/users.csv";
    static UserFactory userFactory = new UserFactory();
    static LanguageFactory languageFactory = new LanguageFactory();

    public static void main(String[] args) {
        try {
            File file = new File(bookPath);
            if (file.createNewFile()) {
                System.out.println("File created.");
                CSVWriter writer = new CSVWriter(bookPath);
                writer.publish();
            }
            System.out.println("Reading files.");
            CSVReader reader = new CSVReader(bookPath, usersPath);
            reader.ParseLanguageCSV(languageFactory);
            reader.ParseUsersCSV(languageFactory, userFactory);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}