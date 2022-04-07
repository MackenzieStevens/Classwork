package Software_Dev_Project;

import java.util.ArrayList;

public class Winner {
    public void decideWinner(ArrayList<Hand> hand, Object player) {
        if (hand.size() != 0) {
            return;
        }
        else {
            System.out.println(player + " wins!");
        }
    }
}
