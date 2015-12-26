import java.util.Random;

/**
 * Created by ${DPudov} on 26.12.2015.
 */
public class LittleBigPerson {
    String params() {
        Random rand = new Random();
        String newparam;
        int x1 = rand.nextInt(Elevator.floors - 1) + 1;
        int x2 = rand.nextInt(Elevator.floors - 1) + 1;
        while (x1 == x2)
            x2 = rand.nextInt(Elevator.floors) + 1;
        newparam = Integer.toString(x1);
        newparam += "," + Integer.toString(x2);
        return newparam;

    }
}
