package basicsPartOne.parameterizedTypes;


public class SecondApplication {
    public static void main(String[] args) {

        GenericClass<Double, Object> genericClass = new GenericClass<>(10.0, "Jeden");
        genericClass.nameOfGenericType();

        double value = genericClass.getGenericVar();
    }
}
