public class InheritenceBasic {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.printInfo();

        Car car = new Car();
        car.printInfo();

        Bicycle bicycle = new Bicycle();
        bicycle.printInfo();

        SuperCar superCar = new SuperCar();
        superCar.printInfo();
        superCar.setSportMode();
    }
}
