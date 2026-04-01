// Easy program to demonstrate Checked and Unchecked Exceptions
public class SimpleExceptionDemo {

    public static void main(String[] args) {
        // Checked Exception Example
        try {
            // FileReader may throw IOException (Checked Exception)
            java.io.FileReader fr = new java.io.FileReader("test.txt");
            fr.close();
        } catch (java.io.IOException e) {
            System.out.println("Caught Checked Exception: " + e);
        }

        // Unchecked Exception Example
        try {
            int result = 10 / 0; // Division by zero (Unchecked Exception)
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e);
        }

        System.out.println("Program finished successfully!");
    }
}