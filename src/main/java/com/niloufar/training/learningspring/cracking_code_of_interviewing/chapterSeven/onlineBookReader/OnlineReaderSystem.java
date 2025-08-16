package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.onlineBookReader;

public class OnlineReaderSystem {
    private Library library;
 private UserManager userManager;
 private Display display;

         private Book activeBook;
 private User activeUser;

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Book getActiveBook() {
        return activeBook;
    }

    public void setActiveBook(Book activeBook) {
        this.activeBook = activeBook;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public OnlineReaderSystem(Library library, UserManager userManager, Display display, Book activeBook, User activeUser) {
        this.library = library;
        this.userManager = userManager;
        this.display = display;
        this.activeBook = activeBook;
        this.activeUser = activeUser;
    }
}
