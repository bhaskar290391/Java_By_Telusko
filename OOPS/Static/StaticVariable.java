package OOPS.Static;

class Mobile {
    String brand;
    int price;
    static String name = "SmartPhone";

    public void show() {
        System.out.println(brand + " :" + price + " : " + name);
    }
}

public class StaticVariable {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m1.brand = "One Plus";
        m1.price = 1500;

        m2.brand = "Samsung";
        m2.price = 100000;

        m1.show();
        m2.show();
    }
}
