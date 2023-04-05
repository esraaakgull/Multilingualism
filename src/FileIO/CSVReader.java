package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    private final String path;
    private final BufferedReader fr;

    //    private final Matcher matcher = Pattern.compile();
    public CSVReader(String bookPath) throws FileNotFoundException {
        this.path = bookPath;
        this.fr = new BufferedReader(new FileReader(bookPath));
    }

    public void ParseFile() throws IOException {

        while (true) {
            String line = fr.readLine();
            if (line != null) {
                String[] languageAndLine = line.split(",",2);
                System.out.println(languageAndLine[0]);
                String[] units = languageAndLine[1].split("UNIT[1-9][0-9]*");
                for (int i = 1; i < units.length; i++) {
                    System.out.println("UNIT" + i + " " + units[i]);
                        String[] unitContents = units[i].split("QUIZ[1-9][0-9]*");
                        for (int j = 1; j < unitContents.length; j++) {
                            System.out.println("QUIZ" + j + " " + unitContents[j].split(",")[1]);
                        }
                }


            } else {
                System.out.println("All the lines have been read.");
                break;
            }
        }
    }
}
