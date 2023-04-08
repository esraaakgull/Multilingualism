package Classes.Questions;

import AbstractClasses.AQuestion;
import Classes.Questions.Contents.AudioContent;

import java.util.Dictionary;
import java.util.HashMap;

public class Speaking extends AQuestion<AudioContent, AudioContent> {

    public Speaking(HashMap<AudioContent, AudioContent> questionContent) {
        super(8, questionContent);
    }

}
