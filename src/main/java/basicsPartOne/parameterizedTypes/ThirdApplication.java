package basicsPartOne.parameterizedTypes;


public class ThirdApplication {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        Character[] characters = {'a', 'b', 'c', 'd', 'e'};

        showArrayElements(numbers);
        showArrayElements(characters);
    }

    public static <T> void showArrayElements(T[] array) {
        for (T element : array) {
            System.out.print(element);
        }
        System.out.println();
    }

//    public static void showArrayElements(Integer[] array) {
//        for (Integer element: array) {
//            System.out.print(element);
//        }
//        System.out.println();
//    }
//
//    public static void showArrayElements(Character[] array) {
//        for (Character element: array) {
//            System.out.print(element);
//        }
//        System.out.println();
//    }
}
