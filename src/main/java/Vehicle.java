public class Vehicle {
    public  String type;
    public String manufacturer;
    public double topSpeed;

    Vehicle(){
        type = "unknown";
        manufacturer = "unknown";
        topSpeed = 0.0;
    }


    public void printInfo(){
        System.out.println("type: " + type + " manufacturer: " + manufacturer +
                            " topSpeed: " + topSpeed);
    }
}
