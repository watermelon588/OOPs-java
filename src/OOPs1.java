import java.util.Scanner;

class Pen {
    String color;
    String type;

    public void write(){
        System.out.println(" Writing !");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    int roll;
    double cgpa;

    public void printDetails(){
        System.out.println("Hello I am "+ this.name + "," + this.age + "years old.");
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
        this.printDetails();
    }
}

public class OOPs1{
    public static void main(String[] args){
        System.out.println("OOPs Concept !");
        Scanner sc = new Scanner(System.in);

        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.type = "Gel pen";

        Pen p2 = new Pen();
        p2.color = "Red";
        p2.type = "Ball pen";

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        Student s1 = new Student(name,age);


    }
}