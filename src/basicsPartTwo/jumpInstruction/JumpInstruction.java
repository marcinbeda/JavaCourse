package basicsPartTwo.jumpInstruction;

/**
 * Created by Marcin Beda.
 */

public class JumpInstruction {

    public static void main(String[] args) {

        int i = 0;

        while (true) {
            i++;
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
            if (i >= 10) {
                break;
            }
        }

    }
}
