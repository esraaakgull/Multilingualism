package Classes.Questions.Contents;

public abstract class Content<T> {
    private final T content;

    Content(T content){
        this.content = content;
    }
    public T getContent(){
        return this.content;
    }
}
