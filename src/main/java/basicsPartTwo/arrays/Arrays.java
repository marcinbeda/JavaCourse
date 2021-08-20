package basicsPartTwo.arrays;


public class Arrays {

    public static void main(String[] args) {

        /* 1 sposób */

        int[] arr = new int[5];
        System.out.println(arr[0]);
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;

        System.out.println(arr[0]);
        System.out.println(arr[4]);
        int i = 4;
        if (i >= 0 && i < arr.length)
            System.out.println(arr[i]);

        /* 2 sposób */

        String[] colors = {"red", "green", "blue"};
        colors[0] = "black";
        System.out.println(colors[0]);

        System.out.println("Długość: " + colors.length);
    }
}
