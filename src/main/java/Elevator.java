/**
 * Created by ${DPudov} on 26.12.2015.
 */
public class Elevator {
    Outsider outsider = new Outsider();
    int t;
    String s1;
    static int floors = 20;
    static int roominess = 8;
    int dirfl = outsider.toCallFloorForward();
    int pos = 1;
    int InnerPers = 0;
    public boolean dir = true;

    public void getParamsAndToGo() {
        t++;
        if ((dir) && (pos < dirfl)) {
            s1 = "вверх";
            pos += 1;
            if (pos == dirfl) {
                dir = false;
            }
        } else {
            if ((!dir) && (pos > 1)) {
                s1 = "вниз";
                dirfl = 1;
                pos -= 1;
                if (pos == 1) {
                    dir = true;
                    updater();
                }

            }
        }
    }

    public void updater() {
        dirfl = outsider.toCallFloorForward();
    }


}
