package AbstractClasses;

import java.util.Dictionary;

public class QSpeaking extends Question {

    public QSpeaking(Integer questionNumber, String questionType, Integer questionPoint, Dictionary<String, Integer> questionContent) {
        super(questionNumber, questionType, questionPoint, questionContent);
    }

    @Override
    public Integer getQuestionNumber() {
        return super.getQuestionNumber();
    }

    @Override
    public void setQuestionNumber(Integer questionNumber) {
        super.setQuestionNumber(questionNumber);
    }

    @Override
    public String getQuestionType() {
        return super.getQuestionType();
    }

    @Override
    public void setQuestionType(String questionType) {
        super.setQuestionType(questionType);
    }

    @Override
    public Integer getQuestionPoint() {
        return super.getQuestionPoint();
    }

    @Override
    public void setQuestionPoint(Integer questionPoint) {
        super.setQuestionPoint(questionPoint);
    }

    @Override
    public Dictionary<String, Integer> getQuestionContent() {
        return super.getQuestionContent();
    }

    @Override
    public void setQuestionContent(Dictionary<String, Integer> questionContent) {
        super.setQuestionContent(questionContent);
    }
}
