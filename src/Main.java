import car.*;

public class Main {
    public static void main(String[] args) {

//        Car[] cars = new Car[5];
//        cars[0] = new Camion();
//        cars[1] = new Sedan();
//        cars[2] = new Sedan();
//        cars[3] = new Sedan();
//        cars[4] = new Limousine();
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i].getName() + " are viteza: " + cars[i].getSpeed() + " and age " +  cars[i].getAge());
//        }

//        Car car = new Sedan();
//
//        car.getSpeed();
//        car.getName();
//        car.getAge();
//        car.getDescription();
//
//        Sedan sedan = new Sedan();
//        sedan.getDescription();
//
//        Car ca2 = new Limousine();
//
//        ca2.getName();
//        ca2.getAge();
//        ca2.getSpeed();
//        ca2.getKm();

//        Parcare parcare = new Parcare();
//
//        Car sedan = new Sedan(); // polimorfism
//
//        Camion camion  = new Camion(); // nu este polimorfism
//        Limousine limousine = new Limousine(); // nu este polimorfism
//
//        parcare.valaasdad(sedan); // nu este polimorfism
//        parcare.valaasdad(camion);
//        parcare.valaasdad(limousine);


        Parcare parcare = new Parcare();

        parcare.printDetails(new Sedan());

        parcare.printDetails(new Camion());

        parcare.printDetails(new Limousine());

        ForSale sale  = new Limousine();
        Car car = new Limousine();

        parcare.sellCar(sale);
        parcare.sellCar(new Limousine());

        ForSale sale2 = new Limousine();
        sale2.sell();

        Limousine limousine = (Limousine) sale2; // Limousine()
        limousine.sell();
        limousine.getName();


        int x = 3;
        int y = 2;

        float z =  (float) 3 /  (float) 2;









    }
}