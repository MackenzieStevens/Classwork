import java.util.ArrayList;

public class Deck{
    public String[] valueList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King"};
    public String[] suitList = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public String value;
    public String suit;
    ArrayList<Object> _deckList = new ArrayList<Object>();
   
    public void generateCards(){
        int valueCount = 0;
        int suitCount = 0;
        for(int i = 0; i < 51; i++){
            if(valueCount == 12){
                valueCount = 0;
                suitCount++;
            }
            //sets values for cards and sends them to the card 
            value = valueList[valueCount];
            suit = suitList[suitCount];
            //Calls constructor to set values for card and creates card objects
            Card card = new Card(value, suit); 

            card.makeCard();
            _deckList.add(card.cardObj);
            //Debugging
            System.out.println(_deckList.get(i));
            valueCount++;
        }
    }
}

