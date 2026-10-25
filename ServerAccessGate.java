import java.util.Scanner;

public class ServerAccessGate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write the security clearance level : "); // asking user to write their security clearance level 
        int securityClearanceLevel = sc.nextInt(); // using int datatypes because the level should be the whole number.

        if (securityClearanceLevel == 4 || securityClearanceLevel == 5) { // user with the security clearance level of 4 or 5 will grant the access.
            System.out.println("Access Granted: Welcome to the Admin Control Panel.");
        }

        else if (securityClearanceLevel == 1 || securityClearanceLevel == 2 || securityClearanceLevel == 3) { // user with the security clearance level of 1 , 2 or 3 don't get the access.
            System.out.println("Access Denied: Standard users cannot enter this zone.");
        }

        else { // this is for any irrelevant input
            System.out.println("Error: Invalid clearance code detected.");
        }

        sc.close();

    }

}
