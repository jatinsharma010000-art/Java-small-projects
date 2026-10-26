public class HollowRectangle {
    public static void main(String[] args) {

        final int row = 4;
        final int column = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) { 

                if (i == 1 || j == 1 || i == row || j == column) {
                    System.out.print("* "); // this will print the * when the conditon hit.
                } // one extra space to make the pattern look good

                else {
                    System.out.print("  "); // print the SPACE , when if condition didn't hit.
                }

            }
            System.out.println(); // this will move the terminal output to the next line.
        }

    }
}
