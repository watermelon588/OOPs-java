import java.util.Scanner;

class Stu{
    String name;
    int roll;
    String dept;

    Stu(String name,int roll,String dept){
        this.name = name;
        this.roll = roll;
        this.dept = dept;
        this.info();
    }

    private void info(){
        System.out.println("Hello !");
        System.out.println("My name is : " + this.name + "\nStudent of " + this.dept + "  Roll no : " + this.roll);
    }

}
public class OOPs2{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("OOPS 2 !");


        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter dept: ");
        String dept = sc.nextLine();
        System.out.println("Enter roll: ");
        int roll = sc.nextInt();

        Stu s1 = new Stu(name , roll , dept);
    }
}
