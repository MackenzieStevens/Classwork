package Software_Dev_Project;

import java.util.ArrayList;
import java.util.Random;

public class DeckB {
    private ArrayList<CardB> _deck;
    Random rand = new Random();     //creates a random number
    


    //constructor to create a new deck
    public DeckB() {
        _deck = new ArrayList<CardB>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
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

    //accessing a random card in the deck
    public int randomCard() {
        int num = _deck.size();   //sets a default deck size
        int randNum = rand.nextInt(num);//generates a random number to access a spot in the deck
        return randNum;
    }
}