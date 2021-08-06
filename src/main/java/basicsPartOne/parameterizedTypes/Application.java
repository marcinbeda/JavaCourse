package basicsPartOne.parameterizedTypes;

import java.util.ArrayList;

/**
 * Created by Marcin Beda.
 */

public class Application {
    public static void main(String[] args) {

        ArrayList arrayList_1 = new ArrayList();

        arrayList_1.add(1);
        arrayList_1.add(1.2345);
        arrayList_1.add("Nietoperz");

        String animal = (String) arrayList_1.get(2);

//        for (String str: arrayList_1) { // error
//            System.out.println(str);
//        }

        ArrayList<String> arrayList_2 = new ArrayList<>();

        arrayList_2.add("Jeden");
        arrayList_2.add("Dwa");
        arrayList_2.add("Trzy");

        for (String str: arrayList_2) {
            System.out.println(str);
        }
    }
}
