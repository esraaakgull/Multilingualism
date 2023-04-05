package AbstractClasses;

import java.util.Dictionary;

public abstract class Question {
    Integer questionNumber;
    String questionType;
    Integer questionPoint;
    Dictionary<String, Integer> questionContent;

    public Question(Integer questionNumber, String questionType, Integer questionPoint, Dictionary<String, Integer> questionContent) {
        this.questionNumber = questionNumber;
        this.questionType = questionType;
        this.questionPoint = questionPoint;
        this.questionContent = questionContent;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
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

