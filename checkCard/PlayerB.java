package checkCard;
public class PlayerB {
    private HandB _hand;
    private int numBooks;

    //constructor
    public PlayerB(HandB hand) {
        _hand = hand;
    }

    //getters
    public HandB gethand() {
        return _hand;
    }

    //setters
    public void setHand(HandB hand) {
        _hand = hand;
    }

    //method to show player hand
    public void showPlayerHand() {
        System.out.println("Number of tricks: " + numBooks + "\nPlayers hand: ");
        _hand.showHand();
        System.out.println("\n");
    }

    //checks if the player has any matching cards
    public void checkForBooks() {
        //looks through the hand
        for (int i = 0; i < _hand.getHandLength(); i++) {
            CardB card1 = _hand.getCard(i);
            String value1 = card1.getValue();
            //checks for a matching card in the hand
            for (int j = i+1; j < _hand.getHandLength(); j++) {
                CardB card2 = _hand.getCard(j);
                String value2 = card2.getValue();
                //compares first card with other cards in the
                if (value1.equals(value2)) {
                    _hand.removeFromHand(i);
                    _hand.removeFromHand(j-1);
                    numBooks++;
                    break;
                }
            }
        }
    }
        
}
