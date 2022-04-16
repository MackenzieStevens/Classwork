package Software_Dev_Project;
 
import java.util.Random;

public class GameB {
    private DeckB playDeck = new DeckB();       //creates the deck used in the game
    private CardB playingCard = new CardB();    //creates a playing card
    private Random rand = new Random();         //creates a random number
    private int num = playDeck.getSize();       //sets a default deck size
    
    public static void main(String[] args) {
        GameB game = new GameB();
        HandB playerHand = new HandB();     //creates a pleyers hand
        HandB player2 = new HandB();
        
        playerHand = game.startingHand(playerHand);
        player2 = game.startingHand(player2);

        //testing the hands
        System.out.println("player1 hand:");
        playerHand.showHand();
        System.out.println("player2 hand:");
        player2.showHand();
        game.playDeck.showDeck();
        
    }

    //creates a starting hand
    public HandB startingHand(HandB hand) {
        //generates starting hand
        for (int i = 0; i < hand.getHandLength(); i++) 
        {
            int randNum = rand.nextInt(num);//generates a random number to access a spot in the deck
            playingCard = playDeck.drawCard(randNum);
            hand.addToHand(playingCard);
            num--;
        }
        return hand;
    }

}
