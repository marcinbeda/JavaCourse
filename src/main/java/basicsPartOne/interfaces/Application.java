package basicsPartOne.interfaces;


public class Application {
    public static void main(String[] args) {

        Robot robot = new Robot(1954);
        robot.run();

        Human human = new Human("Marcin");
        human.oddychaj();

        Informations[] informations = new Informations[]{robot, human};

        for (Informations i : informations) {
            i.showInformations();
        }

        Informations infoRobot = new Robot(999);
        infoRobot.showInformations();

        CognitiveProcess[] cognitiveProcess = new CognitiveProcess[]{robot, human};

        for (CognitiveProcess i : cognitiveProcess) {
            i.think();
        }
    }

    public static void interfaceTest(Informations info) {
        info.showInformations();
    }
}
