public class coursePriceDiscount {

    public static void applyPromoCode(int price) {
        
        int discountedValue = price - 1000;
        System.out.println("the discounted price: " + discountedValue);
        
    }

    public static void main(String[] args) {

        int coursePrice = 5000; // initialize the course price 
        System.out.println("Course Price: " + coursePrice); // print the course price

        applyPromoCode(coursePrice); // pass the course price as a parameter.( java only pass the shallow / local copy )

        System.out.println("the course price: " + coursePrice); // printing the course price after the mathod is finished.

    }

}
