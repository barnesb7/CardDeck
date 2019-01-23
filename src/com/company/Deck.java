package com.company;

import java.util.*;

public class Deck {

    public List<String> entireDeck = new Arrays.asList();

    private final List<String> CARD_NUMBERS = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King");

    public Deck(String suit1, String suit2, String suit3, String suit4){

        for (String cardNumber : CARD_NUMBERS){
            entireDeck.add(suit1 + " - " + cardNumber);
        }
    }




}
