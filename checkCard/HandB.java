package checkCard;
import java.util.ArrayList;

public class HandB {
    private int _handSize;
    private ArrayList<CardB> _hand;

    //constructor to initialize
    public HandB() {
        _handSize = 7;
        _hand = new ArrayList<CardB>();
    }

    public CardB getCard(int i) {
        CardB card = new CardB();
        card = _hand.get(i);
        return card;
    }

    //getters
    public int getHandLength() {
        return _hand.size();
    }

    public ArrayList<CardB> getHandB() {
        return _hand;
    }

    //adds cards to the hand
    public void addToHand(CardB card) {
        _hand.add(card);
    }

    //removes a card from hand
    public void removeFromHand(int i) {
        _hand.remove(i);
    }

    //creates a starting hand
    public HandB startingHand(DeckB deck) {
        HandB hand =new HandB();
        for (int i = 0; i < _handSize; i++) 
        {
            CardB playingCard = new CardB();                       //creates a playing card
            //int randNum = rand.nextInt(deck.getSize());            //generates a random number to access a spot in the deck
            playingCard = deck.drawCard();
            hand.addToHand(playingCard);
        }
        return hand;
    }

    //method to display cards in current hand
    public void showHand() {
        for (int i = 0; i < _hand.size(); i++) {
            System.out.println(_hand.get(i));
        }
    }

    //draws a card from the deck at a random place
   /*  public CardB drawCard(DeckB deck, int i) {
        CardB drawnCard = new CardB();
        if (deck.getSize() > 0) {
            drawnCard = deck.getCard(i);
            deck.removeCard(i);
        }
        return drawnCard;
    } */
    
}
