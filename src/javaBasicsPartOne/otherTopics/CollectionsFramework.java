package javaBasicsPartOne.otherTopics;

/**
 * Created by Marcin Beda.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CollectionsFramework {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.add(0, 10);

        for (int i: arrayList) {
            System.out.println(i);
        }

        int x = arrayList.get(0);

        arrayList.remove(1);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Element 1");
        hashMap.put(1, "Element 2");
        hashMap.put(2, "Element 3");
        hashMap.put(3, "Element 4");

        // System.out.println(hashMap.get(9));

        ArrayList<String> mapList = new ArrayList<>(hashMap.values());

        Collections.shuffle(mapList);

        for (String s: mapList) {
            System.out.println(s);
        }

    }
}












