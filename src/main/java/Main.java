import javax.swing.*;

import static javax.swing.WindowConstants.*;

/**
 * Created by ${DPudov} on 26.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        ElevatorBest elevatorBest = new ElevatorBest();
        Persons persofelev = new Persons();
        persofelev.setParams();
        elevatorBest.setVisible(true);
        elevatorBest.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}
