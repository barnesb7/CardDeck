package com.company;

public class CardDemo {

    public static void main(String[] args) {
        Game game = new Game("Brian", "Mike", "John");

        Deck gameDeck = new Deck();

        System.out.println(game.players.size());

        for (String card : gameDeck.entireDeck){
            System.out.println(card);
        }

    }
}
