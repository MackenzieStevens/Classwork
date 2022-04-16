package checkCard;
public class CardB
{
    private int _suit, _value;
    private String[] _cardSuit = {"Hearts", "Diamonds", "Spades", "Clovers"};
    private String[] _cardValue = {"Ace", "2", "3", "4", "5", 
                                "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

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
    public int getSuit() {
        return _suit;
    }

    public String getValue() {
        return _cardValue[_value];
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CardB other = (CardB) obj;
        if (_value == other._value)
            return false;
        return true;
    }
    
   
}