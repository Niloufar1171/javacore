package com.niloufar.training.learningspring.InterviewCases;
//if it calls by multiple threqads!
//only make those lines that makes the problems dont put on all the method
public class Singleton {
    private static Singleton singletonInstance;

    private Singleton(){}
//    public static siyncronized  com.niloufar.training.learningspring.Singleton getSingletonInstance(){ // have performance issue
    public static Singleton getSingletonInstance(){
//double checking cause we check the null twice
        if(singletonInstance == null){ //if threads check this line then the answer is always null!
            synchronized (Singleton.class){//syncronixed code block
                if(singletonInstance == null){
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }
}
