import java.util.Random;

public class Card{
    private String _value;
    private String _suit;
    String cardObj;
    
    public Card(String value, String suit){
        _value = value;
        _suit = suit;
    }
    
    protected int setRandomSuit(){
        Random r = new Random();
        int lowSuit = 1;
        int highSuit = 5;
        int result = r.nextInt(highSuit - lowSuit) + lowSuit;
        return result;
    }

    public void makeCard(){
        cardObj = _value + " of " + _suit;
    }
}
