package com.niloufar.training.learningspring.testingPractice;

import java.util.ArrayList;

public class process {

    ArrayList<Integer> list ;
    String name ;


    private void initiatName(){
        if(this.name == null)
            throw new IllegalArgumentException("Username cannot be blank");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(this.name == null)
            throw new IllegalArgumentException("Username cannot be blank");
        else
        this.name = name;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }



    private void processList(){
        if(list.size() != 10){
            throw new RuntimeException("The list size is not 10!");
        }
    }

    public static void main(String[] args) {
        process p = new process();
    }
}