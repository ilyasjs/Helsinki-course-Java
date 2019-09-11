
import java.util.ArrayList;

public class TheGreatest {

    public static int greatest(ArrayList<Integer> list) {
        // write code here
        int i = 0;
        int greatest = list.get(0);

        while (i < list.size()) {

            if (list.get(i) > greatest) {
                greatest = list.get(i);
            }
            i++;
        }
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("The greatest number is: " + greatest(lista));
    }
}
