package basicsPartOne.exceptions;


public class Application {
    public static void main(String[] args) {

        try {
            makeConnection(5);
        } catch (WrongPort ex) {
            System.out.println(ex.toString());
        }
    }

    public static void makeConnection(int portNumber) throws WrongPort {
        if (portNumber < 0) {
            throw new WrongPort("Proba otworzenia portu nr " + portNumber);
        } else {
            System.out.println("Port nr " + portNumber + " zostal otwarty.");
        }
    }
}

class WrongPort extends Exception {

    public WrongPort(String exceptionDescription) {
        super(exceptionDescription);
    }
}