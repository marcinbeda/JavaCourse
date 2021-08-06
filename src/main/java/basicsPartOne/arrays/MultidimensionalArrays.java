package basicsPartOne.arrays;

/**
 * Created by Marcin Beda.
 */

public class MultidimensionalArrays {

    public static void main(String[] args) {

        int[][] mother2D = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        int x = mother2D[1][2];

//        System.out.println(x);

        int[][][] mother3D = new int[][][] {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };

        int y = mother3D[1][1][0];

        System.out.println(y);
    }
}
