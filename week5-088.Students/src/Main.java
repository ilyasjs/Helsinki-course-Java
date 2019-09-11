
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program

        ArrayList<Student> list = new ArrayList<Student>();

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("name");
            String name = reader.nextLine();

            if (name.equals("")) {

                break;
            }

            System.out.println("studentnumber");
            String studentNumber = reader.nextLine();

            list.add(new Student(name, studentNumber));

        }
        for (Student stu : list) {
                    //System.out.println(stu.getName());
            //System.out.println(stu.getStudentNumber());
            System.out.println(stu.toString());
        }
        
        System.out.println("");
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result");
        
        for (Student stu : list) {
            if (stu.getName().contains(searchTerm)) {
                System.out.println(stu.toString());
            }
        }
    }
}
