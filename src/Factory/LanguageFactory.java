package Factory;

import Classes.Language;
import Classes.Questions.Contents.AudioContent;
import Classes.Questions.Contents.StringContent;
import Classes.Questions.Listening;
import Classes.Questions.Reading;
import Classes.Questions.Speaking;
import Classes.Questions.WordMatching;
import utils.Randomizer;

import java.util.HashMap;
import java.util.Random;

public class LanguageFactory implements IFactory<Language>, ICollection<HashMap<String, Language>> {
    // Using a hashmap instead of arraylist helps with search functions,
    // Language name is the key of the list, as well as a parameter inside Language class
    protected HashMap<String, Language> languages = new HashMap<>();

//    public void AddLanguage(Language newLanguage) {
////        Language language = new Language(languageName);
//        this.languages.put(newLanguage.getName(), newLanguage);
//    }

    Randomizer randomizer = new Randomizer();
    Random rand = new Random();

    @Override
    public void addToFactory(Language sourceValue) {
        languages.put(sourceValue.getName(), sourceValue);
    }

    @Override
    public HashMap<String, Language> getCollection() {
        return this.languages;
    }


    public Reading generateReadingQ() {
        String str1 = randomizer.generateRandomString();
        String str2 = randomizer.generateRandomString();
        StringContent content1 = new StringContent(str1);
        StringContent content2 = new StringContent(str2);
        HashMap<StringContent, StringContent> hm = new HashMap<>();
        hm.put(content1, content2);
        return new Reading(hm);
    }

    public Listening generateListeningQ() {
        String str = randomizer.generateRandomString();
        Integer aud = rand.nextInt(100);
        StringContent content1 = new StringContent(str);
        AudioContent content2 = new AudioContent(aud);
        HashMap<StringContent, AudioContent> hm = new HashMap<>();
        hm.put(content1, content2);
        return new Listening(hm);
    }

    public Speaking generateSpeakingQ() {
        Integer aud1 = rand.nextInt(100);
        Integer aud2 = rand.nextInt(100);
        AudioContent content1 = new AudioContent(aud1);
        AudioContent content2 = new AudioContent(aud2);
        HashMap<AudioContent, AudioContent> hm = new HashMap<>();
        hm.put(content1, content2);
        return new Speaking(hm);
    }

    public WordMatching generateWordMatchingQ() {
        HashMap<StringContent, StringContent> hm = new HashMap<>();
        int numOfMatches = rand.nextInt(4, 9);
        for (int i = 0; i < numOfMatches; i++) {
            hm.put(new StringContent(randomizer.generateRandomString()), new StringContent(randomizer.generateRandomString()));
        }
        return new WordMatching(hm);
    }


}
