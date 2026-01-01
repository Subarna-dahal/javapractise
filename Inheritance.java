class Vehicle {
    private String brand;
    private int speed;

    Vehicle(String brand, int speed) {

        if(speed <= 0){
            System.out.println("Invalid speed. Setting speed to 0.");
            this.speed = 0;
        } else {
            this.speed = speed;
        }

        if(brand == null || brand.trim().isEmpty()){
            System.out.println("Brand cannot be empty.");
            this.brand = "Unknown";
        } else {
            this.brand = brand;
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    void start() {
        if(speed <= 0){
            System.out.println("Car cannot start. Speed is 0.");
            return;
        }
        System.out.println("Vehicle is starting");
    }

    void display() {
        System.out.println(brand + " has speed of " + speed + " Km/hr");
    }
}

class Car extends Vehicle {
    private String model;

    Car(String brand, int speed, String model){
        super(brand, speed);
        this.model = model;
    }

    void honk() {
        System.out.println("honking by car");
    }

    @Override
    void display(){
        System.out.println(getBrand() + " (" + model + ") has speed of " + getSpeed() + " Km/hr");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car obj1 = new Car("BMW", -3, "34FS");

        obj1.start();
        obj1.honk();
        obj1.display();
    }
}
