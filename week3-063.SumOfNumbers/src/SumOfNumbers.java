
import java.util.ArrayList;

public class SumOfNumbers {

    public static int sum(ArrayList<Integer> list) {
        // Write your code here
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

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The sum: " + sum(list));

        list.add(10);

        System.out.println("The sum: " + sum(list));
    }

}