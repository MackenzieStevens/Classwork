import java.util.Random;
import java.util.Scanner;

public class GameB {
    
    public static void main(String[] args) {
    DeckB deck = new DeckB();
    HandB hand1 = new HandB();
    HandB hand2 = new HandB();
    PlayerB player2 = new PlayerB(hand2.startingHand(deck));
    PlayerB player1 = new PlayerB(hand1.startingHand(deck));
    player1.showPlayerHand();
    player1.checkForBooks();
    player1.showPlayerHand();
    Scanner input = new Scanner(System.in);
    do{
    System.out.println("Player 1's turn");
    int guess = input.nextInt();
    match1(guess, hand1, hand2, deck);
    }while(hand1.getHandLength() != 0 || hand2.getHandLength() != 0);
    }
    
    public static void match1(int guess, HandB hand1, HandB hand2, DeckB deck){
        
        for(int loop = 0; loop<hand1.getHandLength(); loop++){
            //Creates card to check against in loop
            CardB card = hand1.getCard(loop);
            if(hand2.getCard(loop).equals(guess)){
                System.out.println("Match!");
                hand1.addToHand(card);
                hand2.removeFromHand(loop);

            }
            else if(!hand2.getCard(loop).equals(guess)){
                System.out.println("No match");   //Testing purposes
                return;
//
            }
            else{
                System.out.println("Go fish.");
               
                Random rand = new Random();

                int num = playDeck.getSize();
                int randNum = rand.nextInt(num);
                playingCard = playDeck.getCard(randNum);
                hand1.addToHand(playingCard);
                num--;
            }
            
        }
    }
    
}