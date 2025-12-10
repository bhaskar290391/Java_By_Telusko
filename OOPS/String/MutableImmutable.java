package OOPS.String;

public class MutableImmutable {
    public static void main(String[] args) {

        String name = "bhaskar";
        name = name + " Mudaliyar";

        System.out.println(name);

        String s1 = "Bhaskar";
        String s2 = "Bhaskar";

        System.out.println(s1 == s2);
    }
}
