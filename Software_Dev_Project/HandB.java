package Software_Dev_Project;

import java.util.ArrayList;

public class HandB {
    private int _handLength;
    private ArrayList<CardB> _hand;

    public HandB() {
        _handLength = 7;
        _hand = new ArrayList<CardB>();
    }

    //generates a starting hand
    public void startingHand(CardB card) {
        for (int i=0;i<_handLength;i++) {
            _hand.add(card);
        }
    }

    //adds cards to the hand
    public void addToHand(CardB card) {
        _hand.add(card);
    }

    //method to display cards in current hand
    public void showHand() {
        for (int i = 0; i < _hand.size(); i++) {
            System.out.println("Hand item "+ _hand.get(i));
        }
    }
    
}
