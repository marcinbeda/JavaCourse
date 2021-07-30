package classAndMethods;

/**
 * Created by Marcin Beda.
 */

public class InnerClass {

    public static void main(String[] args) {

        Computer computer = new Computer(10);
        computer.run();
        Computer.NetworkCard networkCard = computer.createNetworkCard();
        networkCard.establishConnection();

        Computer.NetworkCard networkCard_2 = computer.new NetworkCard();
        Computer.NetworkCard networkCard_3 = new Computer(5).new NetworkCard();
        networkCard_3.establishConnection();
    }
}
