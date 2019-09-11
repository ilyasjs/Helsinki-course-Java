
import java.util.ArrayList;

public class Variance {

    private static double sum;

    // Copy here sum from exercise 63 

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        int i = 0;
        int size = list.size();
        while (i < size) {
            list.get(i);
            sum = sum + list.get(i);
            i++;
        }
        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (double) sum(list) / list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        int i = 0;
        double average = average(list);
        double numerator = 0;
        while (i < list.size()) {
            list.get(i);
            double diff = list.get(i) - average;
            diff *= diff;
            numerator += diff;
            i++;
        }
        double variance = numerator / (list.size() - 1);
        return variance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
