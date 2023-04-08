package AbstractClasses;

import Classes.Questions.Contents.Content;
import Classes.Questions.Contents.StringContent;

import java.util.Dictionary;
import java.util.HashMap;

public abstract class AQuestion <Q,A> {
    private final int questionPoint;

    //questionContent type will be differed for each question
    // for reading consist of 2 string, listening consist of 1 string and 1 integer...
    // we should do it generic and define in each question type
    private final HashMap<Q,A> questionContent;

    public AQuestion(int questionPoint, HashMap<Q,A> questionContent) {
        this.questionPoint = questionPoint;
        this.questionContent = questionContent;
    }

    public int getQuestionPoint() {
        return this.questionPoint;
    }

//    public void setQuestionPoint(int questionPoint) {
//        this.questionPoint = questionPoint;
//    }

    public HashMap<Q, A> getQuestionContent() {
        return this.questionContent;
    }

//    public void setQuestionContent(HashMap<Content, Content> questionContent) {
//        this.questionContent = questionContent;
//    }
}

