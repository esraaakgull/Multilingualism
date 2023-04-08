package Factory;

import Classes.Language;

import java.util.ArrayList;
import java.util.HashMap;

public class LanguageFactory implements IFactory<String>,ICollection<HashMap<String, Language>>{
    // Using a hashmap instead of arraylist helps with search functions,
    // Language name is the key of the list, as well as a parameter inside Language class
    protected HashMap<String, Language> languages;

    public void CreateLanguage(String languageName) {
        Language language = new Language(languageName);
        languages.put(languageName, language);
    }
    @Override
    public HashMap<String, Language> getCollection() {
        return this.languages;
    }

    @Override
    public void Generate(String sourceValue) {

    }
}
