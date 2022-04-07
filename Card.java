//This is what stores the values of each card as an object
public class Card{
    private String _value;
    private String _suit;
    String cardObj;
    
    //Card Constructor
    public Card(String value, String suit){
        _value = value;
        _suit = suit;
    }
    
    //Just for formatting purposes
    public void makeCard(){
        cardObj = _value + " of " + _suit;
    }
}
