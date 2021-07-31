package parameterizedTypes;

/**
 * Created by Marcin Beda.
 */

public class FourthApplication {
    public static void main(String[] args) {

        Order<Integer, Double> order = new Order<>(10, 100.123);

        System.out.println("Identyfikator zamowienia, to: " + order.getID());
        System.out.println("Wartosc zamowienia, to: " + order.getValue());
    }
}

class Order<I, W> implements Informations<I, W> {

    private I id;
    private W value;

    public Order(I id, W value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public I getID() {
        return id;
    }

    @Override
    public W getValue() {
        return value;
    }
}

interface Informations<I, W> {
    I getID();
    W getValue();
}