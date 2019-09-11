import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random password = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pass = "";
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        
        int i = 0;
        while (i < length){
            int num = password.nextInt(25);
            pass += symbols.charAt(num);
            i++;
        }      
        return pass;
    }
}
