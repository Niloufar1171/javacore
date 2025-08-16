package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.onlineBookReader;

public class User {
    private int userId;
    private String details;
    private int accountType;

    public void renewMembership(){}

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public User(int userId, String details, int accountType) {
        this.userId = userId;
        this.details = details;
        this.accountType = accountType;
    }
}
