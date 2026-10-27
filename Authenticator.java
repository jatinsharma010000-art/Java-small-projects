public class Authenticator { // method overloading

    public static void login(int pin) { // Method named "login"
        System.out.println("System accessed with PIN");
    }

    public static void login(String name, int pin) { // Another method with same name " login "
        System.out.println("User " + name + " logged in securely");
    }

    public static void main(String[] args) {

        int userPIN = 544564;
        String userName = "Jatin sharma";

        login(userPIN); // passing shallow copy to the login method that take only int
        login(userName, userPIN); // passing shallow copy to the login method that take String & int

    }
}
