package model;


import java.time.LocalDate;

public class Post {
    private String title;
    private String content;
    private String author;
    private LocalDate date;

    // Constructor
    public Post(String title, String content, String author, LocalDate date) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
