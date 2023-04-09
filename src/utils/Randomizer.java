package utils;

import java.security.SecureRandom;

import Classes.LanguageBook.Language;

public class Randomizer {
    // since this is an end-simulation, the end-values must be created randomly
    // this class handles every "random" job

//    Random random = new Random();
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public int generateNumberOfDaysInStreak() {
        return SECURE_RANDOM.nextInt(0, 366);
    }

    public Language generateLangChoice(Language[] languages) {
        int languageNumber = SECURE_RANDOM.nextInt(0, languages.length);
        return languages[languageNumber];
    }

    public int generateTakenQuizAmount(Language language){
        return generateRandomNumberBetween(6, language.getTotalQuizAmount());
    }

    public String generateRandomString() {
        int length = SECURE_RANDOM.nextInt(4,8);
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = SECURE_RANDOM.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public int generateRandomNumberBetween(int floor, int ceiling){
        return SECURE_RANDOM.nextInt(floor, ceiling);
    }

    public boolean coinFlip(){
        return SECURE_RANDOM.nextBoolean();
    }
}
