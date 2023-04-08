package utils;

import java.security.SecureRandom;

import Classes.Language;

import java.util.Random;

public class Randomizer {
    // since this is an end-simulation, the end-values must be created randomly
    // this class handles every "random" job

    //todo randomizeri sadece reader ve writer kullansın
    Random random = new Random();
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public int generateNumberOfDaysInStreak() {
        return random.nextInt(0, 366);
    }

    public Language generateLangChoice(Language[] languages) {
        int languageNumber = random.nextInt(0, languages.length);
        return languages[languageNumber];
    }

    public String generateRandomString() {
        int length = random.nextInt();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = SECURE_RANDOM.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
