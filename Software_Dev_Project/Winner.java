package Software_Dev_Project;

import java.util.ArrayList;

public class Winner {
    public void decideWinner(ArrayList<hand> hand, Object player) {
        if (hand.length != 0) {
            return;
        }
        else {
            System.out.println(player + " wins!");
        }
    }
}
