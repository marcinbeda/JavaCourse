package intermediate.functionalProgramming.functionalInterfaces;


public class ExampleFunctionalInterfaces {

    public static void main(String[] args) {

        Runnable r = new Runnable() {

            @Override
            public void run() {
            }
        };

        Comparable<String> c = new Comparable<String>() {

            @Override
            public int compareTo(String o) {
                return 0;
            }
        };
    }
}
