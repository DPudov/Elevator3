import java.util.Random;

/**
 * Created by ${DPudov} on 26.12.2015.
 */
public class Outsider {
    int cntofouts = Persons.count;
    int calledFloorForward = 0;

    public int toCallFloorForward() {
        int[] cl = new int[Persons.count];
        for (int i = 0; i < Persons.count; i++) {
            Random rand = new Random();
            cl[i] = rand.nextInt(Elevator.floors);
        }
        calledFloorForward = cl[0];
        for (int i = 0; i < Persons.count; i++) {
            if (calledFloorForward < cl[i])
                calledFloorForward = cl[i];
        }
        return calledFloorForward;
    }
}
