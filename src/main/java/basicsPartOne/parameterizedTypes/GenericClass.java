package basicsPartOne.parameterizedTypes;


public class GenericClass<T, V> {

    private T genericVar;
    private V secondGenericVar;

    public GenericClass() {
    }

    public GenericClass(T genericVar, V secondGenericVar) {
        this.genericVar = genericVar;
        this.secondGenericVar = secondGenericVar;
    }

    public void nameOfGenericType() {
        System.out.println("Typ T, to: " + genericVar.getClass().getName());
    }

    public T getGenericVar() {
        return genericVar;
    }

    public void setGenericVar(T genericVar) {
        this.genericVar = genericVar;
    }
}
