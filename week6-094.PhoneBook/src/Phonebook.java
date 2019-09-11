
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Phonebook {

    private ArrayList<Person> list;

    public Phonebook() {
        this.list = new ArrayList();
    }

    public void add(String name, String number) {
        list.add(new Person(name, number));
    }

    public void printAll() {
        for (Person people : list) {
            System.out.println(people);
        }
    }

    public String searchNumber(String name) {
        String number = "number not known";
        for (Person people : list) {
            if (name.equals(people.getName())) {
                return people.getNumber();
            }
        }
        return number;
    }
}
