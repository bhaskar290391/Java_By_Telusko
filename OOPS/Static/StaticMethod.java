package OOPS.Static;

class Mobiles {
    String brand;
    int price;
    static String name = "SmartPhone";

    public void show() {
        System.out.println(brand + " :" + price + " : " + name);
    }

    public static void show1(Mobiles mobile) {
        System.out.println(mobile.brand + " :" + mobile.price + " : " + name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobiles m1 = new Mobiles();
        Mobiles m2 = new Mobiles();

        m1.brand = "One Plus";
        m1.price = 1500;

        m2.brand = "Samsung";
        m2.price = 100000;

        m1.show();
        m2.show();

        Mobiles.show1(m1);
    }
}
