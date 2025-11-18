package com.niloufar.training.learningspring.notes.javacore.Referencing;

public class PassByReference {
    public static void main(String[] args) {
        Mug myMug = new Mug("tea");
        Run.spill(myMug);
        System.out.println(myMug.getContent());

    }

    }
class Mug{
    private String content;

    public Mug(String content) {
        this.content = content;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class Run {
    public static void spill(Mug myMug) {
        myMug.setContent("nothing, content is spilled!");
    }
}
