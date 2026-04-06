import java.util.ArrayList;
import java.util.Scanner;

class Average{
    public void Calc(double... numbers){
        if(numbers.length == 0){
            System.out.println("No numbers provided");
            return;
        }
        double sum = 0;
        for(double num : numbers){
            sum += num;
        }
        double avg = sum/numbers.length;
        System.out.println("Average :" + avg);
    }
}

public class OOPs5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Average obj = new Average();

        System.out.println("Enter numbers (type -1 to stop):");
        ArrayList<Double> list = new ArrayList<>();

        while (true){
            double x = sc.nextDouble();
            if(x==-1){
                break;
            }
            list.add(x);
        }
        // convert arraylist to array
        double[] arr = new double[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        obj.Calc(arr);
    }
}
