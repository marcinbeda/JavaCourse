package basicsPartOne.classAndMethods;

/**
 * Created by Marcin Beda.
 */

public class Computer {

    private int user;

    public class NetworkCard {
        public void establishConnection() {
            System.out.println("Uzytkownik nr " + user + " ustanowil polaczenie.");
        }
    }

    public Computer(int user) {
        this.user = user;
    }

    public void run() {

        UPS ups = new UPS();
        ups.charge();

        System.out.println("Witaj uzytkowniku nr " + user);

        NetworkCard networkCard = new NetworkCard();
        networkCard.establishConnection();
    }

    public NetworkCard createNetworkCard() {
        NetworkCard networkCard = new NetworkCard();
        return networkCard;
    }
}

class UPS {
    public void charge() {
        System.out.println("UPS jest naladowany.");
    }
}
