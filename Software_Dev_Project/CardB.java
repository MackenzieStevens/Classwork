package Software_Dev_Project;
 
public class CardB
{
    private int _suit, _value;
    private String[] _cardSuit = {"Hearts", "Diamonds", "Spades", "Clovers"};
    private String[] _cardValue = {"Ace", "Two", "Three", "Four", "Five", 
                                "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    //constructor
    public CardB(int suit, int value) {
        _suit = suit;
        _value = value;
    }

    //overload to create an empty card object
    public CardB() {
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