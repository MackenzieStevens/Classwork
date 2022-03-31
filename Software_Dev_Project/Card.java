package Software_Dev_Project;

public class Card extends Deck
{
    private int _suit, _value;
    private String[] _cardSuit = {"Hearts", "Diamonds", "Spades", "Clovers"};
    private String[] _cardValue = {"Ace", "Two", "Three", "Four", "Five", 
                                "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    //constructor
    public Card(int suit, int value) {
        _suit = suit;
        _value = value;
    }

    public String toString() {
        String finalCard = _cardValue[_value] + " of " + _cardSuit[_suit];
        return finalCard;
    }

    //Getters
    public int get_suit() {
        return _suit;
    }

    public int get_value() {
        return _value;
}
   
}
