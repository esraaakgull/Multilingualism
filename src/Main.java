import book.Publisher;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Main {
    static final String bookPath = "src/book/languages.csv";

    public static void main(String[] args) {
        try {
            File file = new File(bookPath);
            if (file.createNewFile()) {
                System.out.println("File created.");
                Publisher p = new Publisher(bookPath);
                p.publish();
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}