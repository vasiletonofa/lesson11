package car;

public class Camion implements Car {

    public Camion() {

    }
    @Override
    public int getSpeed() {
        return 50;
    }

    @Override
    public String getName() {
        return "Camion";
    }

    @Override
    public String printDefaultInfo() {
        return "Camion info";
    }

    public int getAge() {
        return 5;
    }
}
