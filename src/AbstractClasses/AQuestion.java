package AbstractClasses;

import java.util.Dictionary;

public abstract class AQuestion {
    Integer questionNumber;
    Integer questionPoint;

    //questionContent type will be differed for each question
    // for reading consist of 2 string, listening consist of 1 string and 1 integer...
    // we should do it generic and define in each question type
    Dictionary<String, Integer> questionContent;

    public AQuestion() {
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }


    public Integer getQuestionPoint() {
        return questionPoint;
    }

    public void setQuestionPoint(Integer questionPoint) {
        this.questionPoint = questionPoint;
    }

    public Dictionary<String, Integer> getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(Dictionary<String, Integer> questionContent) {
        this.questionContent = questionContent;
    }
}

