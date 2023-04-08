package Classes.Questions;

import AbstractClasses.AQuestion;
import Classes.Questions.Contents.AudioContent;
import Classes.Questions.Contents.Content;
import Classes.Questions.Contents.StringContent;

import java.util.HashMap;

public class Listening extends AQuestion<StringContent,AudioContent> {

    public Listening(HashMap<StringContent,AudioContent> questionContent) {
        super(7, questionContent);

    }
}

