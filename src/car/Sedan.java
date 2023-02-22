package car;

public class Sedan implements Car {
    @Override
    public int getSpeed() {
        return 120;
    }

    @Override
    public String getName() {
        return "Sedan";
    }

    @Override
    public int getAge() {
        return 9;
    }

    public String getDescription() {
       return  "Sedan description";
    }

    public int getKm() {
        return 22222;
    }
}
