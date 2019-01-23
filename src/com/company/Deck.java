package com.company;

import java.util.*;

public class Deck {

    public ArrayList<String> entireDeck = new ArrayList<>();

    private static final String CLUBS = "clubs";
    private static final String SPADES = "spades";
    private static final String HEARTS = "hearts";
    private static final String DIAMONDS = "diamonds";

        public ArrayList<String> CARD_NUMBERS = new ArrayList<>();

        {
        for(int i = 1; i <= 10; i++)
            CARD_NUMBERS.add(Integer.toString(i));

        CARD_NUMBERS.add("Jack");
        CARD_NUMBERS.add("Queen");
        CARD_NUMBERS.add("King");


         }

    public Deck(){

        for (String cardNumber : CARD_NUMBERS){
            entireDeck.add(cardNumber + " - " + CLUBS);
        }

        for (String cardNumber : CARD_NUMBERS){
            entireDeck.add(cardNumber + " - " + SPADES);
        }

        for (String cardNumber : CARD_NUMBERS){
            entireDeck.add(cardNumber + " - " + HEARTS);
        }

        for (String cardNumber : CARD_NUMBERS){
            entireDeck.add(cardNumber + " - " + DIAMONDS);
        }

    }

}
