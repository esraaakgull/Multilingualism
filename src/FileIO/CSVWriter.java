package FileIO;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CSVWriter {
    private final String path;
    final int UNIT_MIN = 60;
    final int UNIT_MAX = 100;
    final int QUIZ_MIN = 1;
    final int QUIZ_MAX = 10;
    final int QUESTION_MIN = 8;
    final int QUESTION_MAX = 15;
    final int TYPE_COUNT = 4;
    Random rand = new Random();
    final String[] LANGUAGES = {"German", "Turkish", "Italian", "Spanish"};
    final String[] QUESTION_TYPES = {"R", "L", "S", "W"};
    final String SEPARATOR = ",";

    public CSVWriter(String bookPath) {
        this.path = bookPath;
    }

    public void publish() throws IOException {
        try {
            FileWriter file = new FileWriter(path);
            System.out.println("Successfully wrote to the file.");
            for (String language : LANGUAGES) {
                // unit generator
                StringBuilder line = new StringBuilder(language).append(SEPARATOR);
                int unitCount = rand.nextInt(UNIT_MIN, UNIT_MAX + 1);
                for (int i = 1; i <= unitCount; i++) {
                    line.append("UNIT").append(i).append(SEPARATOR);
                    // quiz generator
                    int quizCount = rand.nextInt(QUIZ_MIN, QUIZ_MAX + 1);
                    for (int j = 1; j <= quizCount; j++) {
                        line.append("QUIZ").append(j).append(SEPARATOR);
                        // question generator
                        int questionCount = rand.nextInt(QUESTION_MIN, QUESTION_MAX + 1);
                        Map<String, Integer> questionCountsMatching = new HashMap<>() {{
                            put("R", 0);
                            put("L", 0);
                            put("S", 0);
                            put("W", 0);
                        }};
                        for (int k = 1; k <= questionCount; k++) {
                            int type = rand.nextInt(0, TYPE_COUNT);
                            questionCountsMatching.put(QUESTION_TYPES[type], questionCountsMatching.get(QUESTION_TYPES[type]) + 1);
                        }
                        StringBuilder quizQuestions = new StringBuilder();
                        for (String qType : QUESTION_TYPES) {
                            int count = questionCountsMatching.get(qType);
                            if (count == 0) {
                                continue;
                            }
                            if (quizQuestions.length() == 0) {
                                quizQuestions.append(count).append(qType);
                            } else quizQuestions.append(":").append(count).append(qType);

                        }
                        line.append(quizQuestions).append(SEPARATOR);
                    }
                }
                if (!language.equals(LANGUAGES[LANGUAGES.length - 1])) line.append("\n");
                file.write(String.valueOf(line));

            }
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // language generator
    }
}
