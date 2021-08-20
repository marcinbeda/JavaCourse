package basicsPartTwo.switchStatment;


public class SwitchStatment {

    public static void main(String[] args) {
        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Inny dzień");
                break;
        }

        String namedDay = "Niedziela";

        switch (namedDay) {
            case "Poniedziałek":
                System.out.println("1 dzień tygodnia");
                break;
            case "Wtorek":
                System.out.println("2 dzień tygodnia");
                break;
            default:
                System.out.println("Inny dzień tygodnia");
                break;
        }

    }
}
