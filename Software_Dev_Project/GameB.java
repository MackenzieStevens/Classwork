package Software_Dev_Project;

import java.util.Random;

public class GameB {
    public static void main(String[] args) {
        DeckB playDeck = new DeckB();     //creates the deck used in the game
        HandB playerHand = new HandB();   //creates a pleyers hand
        CardB playingCard = new CardB();  //creates a playing card
        
    
        playingCard = playDeck.drawCard(randNum);
        playerHand.startingHand(playingCard);
        //playerHand.addToHand(playerCard);
        
        //testing the hands
        playerHand.showHand();
        playDeck.showDeck();
    }
}
