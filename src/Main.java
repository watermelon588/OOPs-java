public class Main {

    public static void main(String[] args) {

//      PRIMITIVE DATA TYPE
//        byte	    1	Integer
//        short	    2	Integer
//        int	    4	Integer
//        long	    8	Integer
//        float	    4	Floating
//        double	8	Floating
//        char	    2	Character
//        boolean	~	Logical
        byte age2 = 25;
        int phone = 123456789;
        long phone2 = 123456789;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = false;

//      NON-PRIMITIVE DATA TYPE
        String name = "Aman";
        System.out.println(name.length());

        System.out.println("Hello and welcome " + name + "!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

    }

}