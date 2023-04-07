package Classes.Questions.Contents;

public class VideoContent extends Content {
    private final Integer content;
    VideoContent(int length) {
        this.content = length;
    }

    @Override
    Integer getContent() {
        return this.content;
    }
}
