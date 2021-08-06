package basicsPartOne.parameterizedTypes;

import java.util.ArrayList;

/**
 * Created by Marcin Beda.
 */

public class FifthApplication {
    public static void main(String[] args) {

        ArrayList<SuperRobot> arrayList = new ArrayList<>();

        arrayList.add(new SuperRobot());

        // showElements(0, arrayList); // error
    }

    public static void showElements(int index, ArrayList<? super Robot> arrayList) {

        Object element = arrayList.get(index);

        System.out.println("Element: " + element);
        System.out.println("Typ elementu: " + element.getClass().getName());
    }

    public static <T> void showElements2(int index, ArrayList<T> arrayList) {

        T element = arrayList.get(index);

        System.out.println("Element: " + element);
        System.out.println("Typ elementu: " + element.getClass().getName());
    }
}

class Machine {

}

class Robot extends Machine {

}

class SuperRobot extends Robot {

}
