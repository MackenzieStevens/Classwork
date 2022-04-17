package checkCard;

    
import java.util.Random;
import java.util.Scanner;

public class GameB {
    static String guess;
    public static void main(String[] args) {
    DeckB deck = new DeckB();
    HandB hand1 = new HandB();
    HandB hand2 = new HandB();
    

    PlayerB player1 = new PlayerB(hand1.startingHand(deck));
    player1.showPlayerHand();
    player1.checkForBooks();
    player1.showPlayerHand();
    Scanner input = new Scanner(System.in);
    int count = 0;
    do{
        CardB card = new CardB();
        System.out.println("Player 1's turn");
        player1.showPlayerHand();
        String guess = input.nextLine();
    
        if(card.compareCard(count).equals(guess)){
            match1(hand1, hand2, deck, guess);
        }
        else{
            System.out.println("Please select a valid card : Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king");
        }
    }while(hand1.getHandLength() != 0 || hand2.getHandLength() != 0);
    }
    
    public static void match1(HandB hand1, HandB hand2, DeckB deck, String guess){
        
        for(int i = 0; i<hand1.getHandLength(); i++){
            CardB card = hand1.getCard(i);
            if(hand1.getHandB().equals(guess)){
                System.out.println("Match!");
                hand1.addToHand(card);
                hand2.removeFromHand(i);

            }
            else if (!hand1.getCard(i).equals(guess)){
                System.out.println("No match");
                
            }
            else if(!hand1.getHandB().equals()){
            System.out.println("Go fish.");
                CardB playingCard = new CardB();
                Random rand = new Random();
                int num = deck.getSize();
                int randNum = rand.nextInt(num);
                playingCard = deck.getCard(randNum);
                hand1.addToHand(playingCard);
                num--;
            }
        }
    }
    
}