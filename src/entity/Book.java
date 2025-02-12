package entity;

import java.time.LocalDate;

public class Book {
    private String id;
    private String title;
    private Topic topic;
    private LocalDate releaseDate;
    private Integer pageNumbers;
    private Author author;

    public Book() {
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Integer getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
