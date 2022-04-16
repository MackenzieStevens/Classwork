package checkCard;

    
import java.util.Random;
import java.util.Scanner;

public class GameB {
    static String guess;
    public static void main(String[] args) {
    DeckB deck = new DeckB();
    HandB hand1 = new HandB();

    PlayerB player1 = new PlayerB(hand1.startingHand(deck));
    player1.showPlayerHand();
    player1.checkForBooks();
    player1.showPlayerHand();
    Scanner input = new Scanner(System.in);
    do{
    System.out.println("Player 1's turn");
    String guess = input.nextLine();
    
    }while();
    }
    
    public static void match1(){
        HandB hand1 =new HandB();
        for(int i = 0; i<hand1.getHandLength(); i++){
            if(hand1.getHandB().equals(guess)){
                System.out.println("Match!");
                hand1.addToHand(i);
                player2.remove(i);

            }
            else{
                System.out.println("Go fish.");
                CardB playingCard = new CardB();
                Random rand = new Random();
                DeckB playDeck =new DeckB();
                int num = playDeck.getSize();
                int randNum = rand.nextInt(num);
                playingCard = playDeck.getCard(randNum);
                hand1.addToHand(playingCard);
                num--;
            }
            
        }
    }
    
}