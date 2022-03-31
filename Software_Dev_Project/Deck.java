package Software_Dev_Project;
import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                deck.add(new Card(i, j));
            }
        }
    }
}
