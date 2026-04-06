import java.util.*;

public class OOPs3{
    public static void main(String args[]){
        // Count no. of arguments
        int count = args.length;
        //store first letters variable
        StringBuilder first_letter = new StringBuilder();
        //itterate through and store
        for(String arg : args){
            if(arg.length() > 0){
                first_letter.append(arg.charAt(0));
            }
        }
        // Print result
        System.out.println("No. of arguments - " + count + " " + first_letter);
    }
}