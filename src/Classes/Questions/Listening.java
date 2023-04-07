package Classes.Questions;

import AbstractClasses.AQuestion;

import java.util.Dictionary;

public class Listening extends AQuestion {

    public Listening() {
        setQuestionPoint(7);
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

