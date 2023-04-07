package Classes.Questions.Contents;

public class StringContent extends Content {
    private final String content;
    StringContent(String text){
        this.content = text;
    }

    @Override
    String getContent() {
        return this.content;
    }
}
