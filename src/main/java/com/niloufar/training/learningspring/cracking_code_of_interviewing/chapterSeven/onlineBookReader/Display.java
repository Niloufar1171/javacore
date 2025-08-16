package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.onlineBookReader;

public class Display {
    private Book book;
    private User user;
    private int pageNumber = 0;

    public void DisplayUser(){}
    public void DisplayBook(){}
    public void turnPageForward(){ pageNumber ++;}
    public void turnPageBackward(){pageNumber --;}
    public void  refreshUsername() {/* updates username display*/}
    public void  refreshTitle() {/* updates title display*/}
    public void  refreshDetails() {/* updates details display*/ }
    public void  refreshPage() {/* updated page display*/}

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Display(Book book, User user, int pageNumber) {
        this.book = book;
        this.user = user;
        this.pageNumber = pageNumber;
    }



}
