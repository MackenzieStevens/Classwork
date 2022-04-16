package Software_Dev_Project;
 
import java.util.Random;
import java.util.Scanner;

public class GameB {
    private DeckB playDeck = new DeckB();       //creates the deck used in the game
    private CardB playingCard = new CardB();    //creates a playing card
    private Random rand = new Random();         //creates a random number
    private int num = playDeck.getSize();       //sets a default deck size
    static String guess;
    static int p1Score;
    static int p2Score;
    public static void main(String[] args) {
        GameB game = new GameB();
        HandB playerHand = new HandB();     //creates a pleyers hand
        HandB player2 = new HandB();
        Scanner input = new Scanner();
        
        playerHand = game.startingHand(playerHand);
        player2 = game.startingHand(player2);

        //testing the hands
        System.out.println("player1 hand:");
        playerHand.showHand();
        System.out.println("player2 hand:");
        player2.showHand();
        //game.playDeck.showDeck();
        do{
        System.out.println("Player 1's turn.");
        guess = input.nextLine(System.in);
        match1();
        System.out.println("Player 2's turn.");
        guess = input.nextLine(System.in);
        match2();
        }while(playerHand._hand.size() != 0 || player2._hand.size() !=0);
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

    public static void match1(){
        for(int i = 0; i<playerhand._hand.lenth; i++){
            if(playerhand._hand.get(i).equals(guess)){
                System.out.println("Match!");
                playerhand._hand.add(i);
                player2._hand.remove(i);

            }
            else{
                System.out.println("Go fish.");
                CardB playingCard = CardB();
                Random rand = Random();
                Deck playDeck = Deck();
                int num = playDeck.getSize();
                int randNum = rand.nextInt(num);
                playingCard = playDeck.drawCard(randNum);
                hand.addToHand(playingCard);
                num--;
            }
            
        }
    }



}
