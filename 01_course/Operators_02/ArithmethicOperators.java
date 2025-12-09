
public class ArithmethicOperators {
    public static void main(String[] args) {

        int number1 = 7;
        int number2 = 5;

        int add = number1 + number2;
        int sub = number1 - number2;
        int division = number1 / number2;
        int multiplication = number1 * number2;
        int modulus = number1 % number2;

        System.out.println("The addition is " + add);
        System.out.println("The subraction is " + sub);
        System.out.println("The division is " + division);
        System.out.println("The multiplication is " + multiplication);
        System.out.println("The Modulus is " + modulus);

        number1 = number1 + 1;
        System.out.println("The value of number1 " + number1);
        number1 += 1;
        System.out.println("The value of number1 " + number1);
        number1++;
        System.out.println("The value of number1 " + number1);

        ++number1;
        System.out.println("The value of number1 " + number1);

        number1--;
        System.out.println("The value of number1 " + number1);

    }
}
