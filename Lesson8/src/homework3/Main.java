package homework3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Spaceport canaveral = new Spaceport();
        IStart[] rockets = {new Shuttle(), new SpaceXBFR()};
        for (IStart rocket : rockets) {
            canaveral.launch(rocket);
            System.out.println();
        }
    }
}
