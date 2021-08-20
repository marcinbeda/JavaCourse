package basicsPartOne.abstractClasses;


public class Application {
    public static void main(String[] args) {

        // Maszyna maszyna = new Maszyna(); // Error
        Robot robot = new Robot();

        robot.setSerialNumber(314159);
        System.out.println(robot.getSerialNumber());

        robot.run();
    }
}
