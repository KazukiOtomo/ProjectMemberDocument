package lecture05;

import java.util.ArrayList;

public class Exercise5_7 {
    public static void main(String[] args) {
        ArrayList<Insect> InsectList = new ArrayList<>();

        InsectList.add(new Insect());
        InsectList.add(new Butterfly());
        InsectList.add(new Locust());
        InsectList.add(new SwallowtailButterfly());

        for (Insect insect : InsectList) {
            insect.move();
        }
    }
}
