package Classes.Questions;

import AbstractClasses.AQuestion;
import Classes.Questions.Contents.StringContent;

import java.util.Dictionary;
import java.util.HashMap;

public class WordMatching extends AQuestion<StringContent,StringContent> {

    public WordMatching(HashMap<StringContent,StringContent> questionContent) {
        super(5, questionContent);
    }
}
