import java.util.Scanner;

public class TerminalLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int PIN = 8888; // initilize the PIN

        System.out.print("Enter the PIN : "); // asking the user for the PIN
        int userPIN = sc.nextInt(); // this is where the user will enter their PIN

        while (userPIN != PIN) { // initilize the while loop with the condition of keeping going until the user PIN is equal to actual PIN.

            System.out.println("Incorrect PIN. Try again."); // if the user enter the wrong PIN , this msg will printed.
            System.out.print("Enter the PIN : "); // asking again the user to write the PIN
            userPIN = sc.nextInt(); // this is where the user will enter the PIN

        }

        System.out.println("Authentication successful."); // is the user enter the right PIN , this msg will printed.

        sc.close(); // close the scanner object
    }
}
