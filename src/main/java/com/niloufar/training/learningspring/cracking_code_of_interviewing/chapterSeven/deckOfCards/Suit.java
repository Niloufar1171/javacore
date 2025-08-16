package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.deckOfCards;

public enum Suit {

    HEARTS(0),
    SPADES(1),
    CLUBS(2),
    DIAMONDS(3);

    private int value;

    Suit(int i) {
    }

    private int getValue(){return value;}
   // private static Suit getSuitFromValue(int value){}

}
