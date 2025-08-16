package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.onlineBookReader;

public class Book {
    private int bookId;
    private String details;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Book(int bookId, String details) {
        this.bookId = bookId;
        this.details = details;
    }
}
