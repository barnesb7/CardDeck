package com.company;
import java.util.*;

public class Player {

    private String name;
    private ArrayList<String> hand = new ArrayList<>();

    public Player(String givenName){
        name = givenName;
    }

    public void addCardToHand(String cardName){
            hand.add(cardName);
    }

    public String getName(){
        return name;
    }

    public String getHand(){
        return String.join(", " , hand);
    }

}
