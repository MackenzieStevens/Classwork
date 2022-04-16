package checkCard;
import java.util.ArrayList;
import java.util.Random;

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

    //gets a card
    public CardB getCard(int i) {
        return _deck.get(i);
    }

    public void removeCard(int i) {
        _deck.remove(i);
    }

     public CardB drawCard() {
         Random rand = new Random();
         int i = rand.nextInt(_deck.size());
         CardB drawnCard = new CardB();
        if (_deck.size() > 0) {
              drawnCard = _deck.get(i);
            _deck.remove(i);
          }
        return drawnCard;
    }

}