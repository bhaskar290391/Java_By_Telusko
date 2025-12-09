public class OperatorsCodingExcercise {
    public static void main(String[] args) {

        // write code here
        int a = 20;
        int b = 10;

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;

        boolean result = a > b;

        boolean result1 = (a > b) && (b > 0);

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Is a greater than b? " + result);
        System.out.println("Is a > b and b > 0? " + result1);

    }
}
