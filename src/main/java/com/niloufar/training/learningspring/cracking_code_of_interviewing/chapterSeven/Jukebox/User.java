package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.Jukebox;

public class User{
    private String name;
    private Long ID;

    public java.lang.String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getID() {
        return ID;
    }

    public User(String name, Long ID) {
        this.name = name;
        this.ID = ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public static User addUser(String name, Long ID ){
        User u = new User(name, ID);
        return  u;
    }
}
