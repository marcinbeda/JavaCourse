package basicsPartOne.abstractClasses;


public abstract class Machine {

    private int serialNumber;

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public abstract void run();
}
