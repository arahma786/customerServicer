package c322.homework.homework6.partd;

public class Video {
    private String id;
    private String title;

    public Video() {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Video [id=" + id + ", title=" + title + "]";
    }
}
