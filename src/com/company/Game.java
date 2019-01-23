package com.company;
import java.util.*;

public class Game {

    ArrayList<Player> players = new ArrayList<>();

    public Game(String... names){

        for (String name : names) {
            players.add(new Player(name));
        }
    }

}
