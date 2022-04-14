public class GameB {
    public static void main(String[] args) {
    DeckB deck = new DeckB();
    HandB hand1 = new HandB();
    PlayerB player1 = new PlayerB(hand1.startingHand(deck));
    player1.showPlayerHand();
    player1.checkForBooks();
    player1.showPlayerHand();
    }
    
    
}