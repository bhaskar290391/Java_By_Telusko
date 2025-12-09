package OOPS;

class MethodRidingDemo {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, int num2) {
        return num1 + num2;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        MethodRidingDemo demo = new MethodRidingDemo();
        int result = demo.add(5, 6);
        System.out.println("The result " + result);

        int resilt = demo.add(4, 6, 5);
        System.out.println("The resilt " + resilt);
    }
}
