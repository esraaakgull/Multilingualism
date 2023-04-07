import Classes.FileIO.CSVReader;
import Classes.FileIO.CSVWriter;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Main {
    static final String bookPath = "src/languages.csv";

    public static void main(String[] args) {
        try {
            File file = new File(bookPath);
            if (file.createNewFile()) {
                System.out.println("File created.");
                CSVWriter writer = new CSVWriter(bookPath);
                writer.publish();
            } else {
                System.out.println("File already exists.");
                CSVReader reader = new CSVReader(bookPath);
                reader.ParseFile();
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}