package nsu.domain;

public class Post {
    private Long id;
    private String title;

    public Post(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void updateTitle(String newTitle) {
        this.title = newTitle;
    }
}
