package task.ui.com.testui.model;

public class News {
    String photo;
    String title;
    String author_name;
    String author_photo;
    int likers;
    int comment;

    public News(String photo, String title, String author_name, String author_photo, int likers, int comment) {
        this.photo = photo;
        this.title = title;
        this.author_name = author_name;
        this.author_photo = author_photo;
        this.likers = likers;
        this.comment = comment;
    }

    public String getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getAuthor_photo() {
        return author_photo;
    }

    public int getLikers() {
        return likers;
    }

    public int getComment() {
        return comment;
    }
}
