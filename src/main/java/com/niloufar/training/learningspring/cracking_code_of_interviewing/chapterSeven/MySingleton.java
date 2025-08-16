package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven;

import dailypractice.july.july5.Singleton.Singleton;

public class MySingleton {

    private static volatile MySingleton singletonInstance;

    public static   MySingleton getMYSingletonInstance(){

       if(singletonInstance ==null) {
           synchronized (Singleton.class) {
               if (singletonInstance == null)
                   singletonInstance = new MySingleton();
           }
        }

        return singletonInstance;
    }
}
