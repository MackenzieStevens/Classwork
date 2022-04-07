package Software_Dev_Project;
 
import java.util.ArrayList;

public class DeckB {
    private ArrayList<CardB> _deck;
    


    //constructor to create a new deck
    public DeckB() {
        _deck = new ArrayList<CardB>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                _deck.add(new CardB(i, j));
            }
        }
    }

    //draws a card from the deck at a random place
    public CardB drawCard(int i) {
        CardB drawnCard = _deck.get(i);
        _deck.remove(i);
        return drawnCard;
    }

    //method to show cards currently in deck
    public void showDeck() {
        for (int i = 0; i < _deck.size(); i++) {
            System.out.println(_deck.get(i));
        }
    }

    //returns array size
    public int getSize() {
        return _deck.size();
    }

}