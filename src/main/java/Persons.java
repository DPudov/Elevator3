import java.util.ArrayList;

import static java.lang.Integer.parseInt;

/**
 * Created by ${DPudov} on 26.12.2015.
 */
public class Persons {
    static int count = 10;
    public int maxa1 = 0;
    public int maxa2 = 0;
    int[] a1 = new int[count];
    int[] a2 = new int[count];
    ArrayList<String> Person = new ArrayList<>();
    LittleBigPerson GoodPers = new LittleBigPerson();



    public int setParams() {


        int i = 0;
        while (i < count) {
            Person.add(i, GoodPers.params());
            String pos1 = GoodPers.params().substring(0, chpos(GoodPers.params()));
            String pos2 = GoodPers.params().substring(chpos(GoodPers.params() + 2));
            try {
                a1[i] = parseInt(pos1);
                a2[i] = parseInt(pos2);
            } catch (NumberFormatException e) {
                System.err.println("Informal string");
            }
            i++;
        }
        int mina2 = a2[0];
        for (int i1 = 0; i1 < a1.length; i1++)
            if (maxa1 < a1[i1])
                maxa1 = a1[i1];
        for (int i2 = 0; i2 < a2.length; i2++) {
            if (maxa2 < a2[i2])
                maxa2 = a2[i2];
            if (mina2 > a2[i2])
                mina2 = a2[i2];
        }
        return maxa1;
    }

    public static int chpos(String s) {
        int charpos = 0;

        char[] chArray = s.toCharArray();
        for (int i = 0; i < chArray.length; i++) if (chArray[i] == ',') charpos = i - 1;
        return charpos;
    }

    public void toGetIn(Elevator elevator, Outsider outsider) {
        for (int i = 0; i < count; i++) {
            if ((elevator.pos == a1[i]) && (elevator.InnerPers < Elevator.roominess)) {
                elevator.InnerPers++;
                outsider.cntofouts--;

            }
        }
    }

    public void toGetOut(Elevator elevator, Outsider outsider) {
        for (int i = 0; i < count; i++) {
            if (elevator.pos == a2[i]) {
                elevator.InnerPers--;
                outsider.cntofouts++;
            }
        }
    }
}
