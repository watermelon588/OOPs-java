// Shape class
class Shape{
    protected final double PI = 3.14159;
    // volume overloading
    // 1. parallelepiped
    double volume(double l,double b,double h){
        return l*b*h;
    }
    // 2. cylinder
    double volume(double r,double h){
        return PI*r*r*h;
    }
    // 3. shere
    double volume(double r){
        return (4.0/3.0)*PI*r*r*r;
    }
    //surface area overloading
    // 1. parallelepiped
    double surfaceArea(double l,double b,double h){
        return 2 * (l*b + l*h + b*h);
    }
    // 2. cylinder
    double surfaceArea(double r,double h){
        return 2 * PI * r * (r + h);
    }
    // 3. shere
    double surfaceArea(double r){
        return 4 * PI * r * r;
    }
}
// parallelepiped
class Parallelepiped extends Shape{
    private double l;
    private double b;
    private double h;
    // constructor
    Parallelepiped(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    // function
    void show(){
        System.out.println("\n--- Parallelepiped ---");
        System.out.println("Volume: " + volume(l, b, h));
        System.out.println("Surface Area: " + surfaceArea(l, b, h));
    }
}
// cylinder
class Cylinder extends Shape{
     double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void show() {
        System.out.println("\n--- Cylinder ---");
        System.out.println("Volume: " + volume(r, h));
        System.out.println("Surface Area: " + surfaceArea(r, h));
    }
}
// sphere
class Sphere extends Shape{
    double r;

    Sphere(double r) {
        this.r = r;
    }

    void show() {
        System.out.println("\n--- Sphere ---");
        System.out.println("Volume: " + volume(r));
        System.out.println("Surface Area: " + surfaceArea(r));
    }
}

public class OOPs7 {
    public static void main(String args[]){
        Parallelepiped p = new Parallelepiped(2, 3, 4);
        Cylinder c = new Cylinder(3, 5);
        Sphere s = new Sphere(2.5);

        p.show();
        c.show();
        s.show();
    }
}
