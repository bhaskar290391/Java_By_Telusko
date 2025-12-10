package OOPS.Static;

class Mobiless {
    String brand;
    int price;
    static String name;

    Mobiless() {
        System.out.println("Inside the constructor");
    }

    static {
        System.out.println("Inside the static block");
        name = "SmartPhone";
    }

    public void show() {
        System.out.println(brand + " :" + price + " : " + name);
    }

}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobiless m1 = new Mobiless();
        // Mobiless m2 = new Mobiless();

        // m1.brand = "One Plus";
        // m1.price = 1500;

        // m2.brand = "Samsung";
        // m2.price = 100000;

        // m1.show();
        // m2.show();

        Class.forName("Mobiless");

    }
}
