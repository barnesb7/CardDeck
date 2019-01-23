package com.company;

public class CardDemo {

    public static void main(String[] args) {
        Game game = new Game("Brian", "Mike", "John");

        System.out.println(game.players.size());

        for(String card: game.gameDeck){
            System.out.println(card);
        }

    }
}
