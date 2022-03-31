public class Game {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int i = 0; i < deck.deck.size(); i++) {
            System.out.println(deck.deck.get(i));
        }
    }
}
