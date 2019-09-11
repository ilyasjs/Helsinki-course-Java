
import java.util.Scanner;


public class Accounts {
   

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account myAccount = new Account("Ilyas", 100.00);
        
        System.out.println("Initial state");
        System.out.println(myAccount);
        
        myAccount.deposit(20);
        
        System.out.println("Ilyas account balance is now: " + myAccount);
        
        System.out.println("Final state");
        System.out.println(myAccount);
    }

}
