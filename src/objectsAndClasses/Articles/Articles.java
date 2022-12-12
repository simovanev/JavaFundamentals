package objectsAndClasses.Articles;

public class Articles {

    String title;
    String content;
    String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String content) {
        this.content = content;
    }

    public void changeAuthor(String change) {
        this.author = change;
    }

    public void rename(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);

    }
}
