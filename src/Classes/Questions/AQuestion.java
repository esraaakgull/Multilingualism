package Classes.Questions;

import java.util.HashMap;

public abstract class AQuestion <Q,A> {
    private final int questionPoint;

    private final HashMap<Q,A> questionContent;

    public AQuestion(int questionPoint, HashMap<Q,A> questionContent) {
        this.questionPoint = questionPoint;
        this.questionContent = questionContent;
    }

    public int getQuestionPoint() {
        return this.questionPoint;
    }


    public HashMap<Q, A> getQuestionContent() {
        return this.questionContent;
    }

}

