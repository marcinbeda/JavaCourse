package interfaces;

/**
 * Created by Marcin Beda.
 */

public class Robot implements Informations, CognitiveProcess {

    private int serialNumber;

    public Robot(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void run() {
        System.out.println("Robot nr " + serialNumber + " zostal uruchomiony.");
    }

    @Override
    public void showInformations() {
        System.out.println("Numer seryjny robota, to: " + serialNumber);
    }

    @Override
    public void think() {
        System.out.println("Robot nr " + serialNumber + " teraz mysli.");
    }
}
