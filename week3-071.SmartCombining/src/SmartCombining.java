
import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int i = 0;
        for (Integer number : list1) {
            while (list2.contains(number)) {
                    list2.remove(number);                
            } 
        }

        list1.addAll(list2);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // Remove comment when method ready
        // smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}


