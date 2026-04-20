import java.util.Scanner;

// vehicle class

class Vehicle{
    // variables
    protected String Licence_number;
    protected int speed;
    protected String color;
    protected String owner_name;

    // constructor
    Vehicle(String Licence_number,int speed,String color,String owner_name){
        this.Licence_number = Licence_number;
        this.speed = speed;
        this.color = color;
        this.owner_name = owner_name;
    }
    // function
    void showdata(){
        System.out.println("This is a vehicle class");
        System.out.println("Licence Number: " + Licence_number);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + owner_name);
    }
}

// Bus class
class Bus extends Vehicle{
    private int route_no;

    // constructor
    Bus(String Licence_number,int speed,String color,String owner_name,int route_no){
        super(Licence_number, speed, color, owner_name);
        this.route_no=route_no;
    }
    // function
    @Override
    void showdata(){
        super.showdata();
        System.out.println("Route Number: " + route_no);
        System.out.println("This is a Bus class");
    }
}
// Car class
class Car extends Vehicle {
    private String manufacturer;
    //constructor
    Car(String Licence_number,int speed,String color,String owner_name, String manufacturer) {
        super(Licence_number,speed,color,owner_name);
        this.manufacturer = manufacturer;
    }
    //function
    @Override
    void showdata() {
        super.showdata();
        System.out.println("Manufacturer Name: " + manufacturer);
        System.out.println("This is a Car class");
    }
}

public class OOPs6{
    public static void main(String args []){
        Bus b = new Bus("MH12AB1234", 60, "Yellow", "Rohit", 101);
        Car c = new Car("MH14CD5678", 120, "Red", "Amit", "Toyota");

        System.out.println("\n--- Bus Details ---");
        b.showdata();

        System.out.println("\n--- Car Details ---");
        c.showdata();
    }
}
