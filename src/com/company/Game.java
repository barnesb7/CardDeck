package com.company;
import java.util.*;

public class Game {

    ArrayList<Player> players = new ArrayList<>();

    Deck gameDeck;

    public Game(String... names){

        gameDeck = new Deck("Hearts", "Clubs", "Spades", "Diamonds");

        for (String name : names) {
            players.add(new Player(name));
        }
    }

}
