package basicsPartTwo.multidimensionalArrays;


public class MultidimensionalArrays {

    public static void main(String[] args) {

        int[][] arr = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[2];
        arr[2] = new int[7];
        arr[0][4] = 9;
//        System.out.println(arr[0][4]);

        int[][] arr2 = {{1, 4, 5}, {2, 5, 7, 8}, {2, 1}};

        for (int[] items : arr2) {
            for (int item : items) {
                System.out.print(item);
            }
            System.out.println();
        }

    }
}
