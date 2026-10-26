public class VariableScope {
    public static void main(String[] args) {
        int myNumber = 10;
        System.out.println("1. Main before method: " + myNumber);
        
        // Pass the variable into the method (Java only sends a copy)
        changeValue(myNumber);
        
        // Check the original variable after the method finishes
        System.out.println("3. Main after method: " + myNumber);
    }

    public static void changeValue(int number) {
        // Change the local copy
        number = 20;
        System.out.println("2. Inside changeValue method: " + number);
    }
}