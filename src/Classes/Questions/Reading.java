package Classes.Questions;

import AbstractClasses.AQuestion;
import Classes.Questions.Contents.Content;
import Classes.Questions.Contents.StringContent;

import java.util.HashMap;

public class Reading extends AQuestion<StringContent, StringContent> {

    public Reading(HashMap<StringContent,StringContent> questionContent) {
        super( 10, questionContent);
    }
}
