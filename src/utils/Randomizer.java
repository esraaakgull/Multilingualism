package utils;

import Classes.Language;

import java.util.HashMap;
import java.util.Random;

public class Randomizer {
    // since this is an end-simulation, the end-values must be created randomly
    // this class handles every "random" job

    //todo randomizeri sadece reader ve writer kullansın
    Random random = new Random();

    public int generateNumberOfDaysInStreak() {
        return random.nextInt(0, 366);
    }

    public Language generateLangChoice(Language[] languages) {
        int languageNumber = random.nextInt(0, languages.length);
        return languages[languageNumber];
    }
}
