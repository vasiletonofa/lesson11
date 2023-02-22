package car;

public class Parcare {

    public void printDetails(Car car) { // new Sedan(), new Camion()
        System.out.println("Nume: " + car.getName());
        System.out.println("Viteza: " + car.getSpeed());
        System.out.println("Varsta: " + car.getAge());
        System.out.println("Info: " + car.printDefaultInfo());


        Car car2 = new Limousine(); // polimorfism
        car2.getName();

        Limousine limousine2 =  (Limousine) car2;  // anulare polimorfism, incheiat contractul cu Car
        limousine2.getKm();

         // POLOMORFISM
        // 1. Parintele poate pastra obiecte de tip copil
        // 2. Parintele poate apela metodele copilului
        // 3. Parintele poate apela metodele care le cunoaste

        // CASTING
        // 1. Ex




        if(car.getName() == "Sedan") {
            Sedan sedan =  (Sedan) car;
            sedan.getDescription();
        }

        if (car instanceof Sedan) {
            Sedan sedan =  (Sedan) car; // anulat polimorfism
            sedan.getDescription();
        }

        if(car instanceof Limousine) {
            Limousine limousine =  (Limousine) car;
            limousine.getKm();
        }

    }

    public void sellCar(ForSale forSale) { // new Limousine()
        forSale.sell();
    }

//    public void getInfoAboutCar(Sedan sedan) {
//        System.out.println("Nume: " + sedan.getName());
//        System.out.println("Viteza: " + sedan.getSpeed());
//        System.out.println("Varsta: " + sedan.getAge());
//        System.out.println("Varsta: " + sedan.getKm());
//    }
//
//    public void getInfoAboutCar(Limousine limousine) {
//        System.out.println("Nume: " + limousine.getName());
//        System.out.println("Viteza: " + limousine.getSpeed());
//        System.out.println("Varsta: " + limousine.getAge());
//        System.out.println("Varsta: " + limousine.getKm());
//    }
//
//    public void getInfoAboutCar(Camion camion) {
//        System.out.println("Nume: " + camion.getName());
//        System.out.println("Viteza: " + camion.getSpeed());
//        System.out.println("Varsta: " + camion.getAge());
//    }

}
