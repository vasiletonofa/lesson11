package car;

public class Limousine implements Car, ForSale {

    int km;

    @Override
    public int getSpeed() {
        return 40;
    }

    @Override
    public String getName() {
        return "Limousine";
    }

    @Override
    public int getAge() {
        return 2;
    }

    public int getKm() {
        return 10000;
    }

    @Override
    public int sell() {
        System.out.println(200000);
        return 200000;
    }
}
