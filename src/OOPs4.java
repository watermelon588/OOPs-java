import java.util.Scanner;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    class Adress{
        private String city;
        private int pincode;
    
        public Adress(String city, int pincode){
            this.city = city;
            this.pincode = pincode;
        }
        public void displayDetails() {
            System.out.println("________________________");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
            System.out.println("Pin Code: " + pincode);
        }
    }  
}

public class OOPs4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        sc.nextLine(); 

        System.out.println("Enter city: ");
        String city = sc.nextLine();

        System.out.println("Enter pin: ");
        int pin = sc.nextInt();

        Person person = new Person(name,age);
        Person.Adress addr = person.new Adress(city,pin);

        addr.displayDetails();
    }
    
}
