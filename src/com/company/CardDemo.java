package com.company;

import java.util.Random;

public class CardDemo {

    public static void main(String[] args) {

        Random random = new Random();
        Game game = new Game("Brian", "Shaina", "Mike", "John");

        Deck gameDeck = new Deck();

        // deal cards to players
        for (Player player : game.players){

            for (int i = 0; i <= 3; i++){

                int randomIndex = random.nextInt(gameDeck.entireDeck.size());

                String cardToBeDealt = gameDeck.entireDeck.get(randomIndex);

                player.addCardToHand(cardToBeDealt);

                gameDeck.entireDeck.remove(randomIndex);  // remove card from deck stopping duplicates to be dealt
            }

            System.out.println(player.getName() + ": " + player.getHand());
        }


    }
}
