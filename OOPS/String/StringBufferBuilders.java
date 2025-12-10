package OOPS.String;

public class StringBufferBuilders {
    public static void main(String[] args) {

        StringBuffer br = new StringBuffer("Bhaskar");
        System.out.println(br.capacity());
        br.append(" Mudaliyar");
        System.out.println(br.capacity());
        System.out.println(br.length());

        System.out.println(br.substring(4, 6));
        System.out.println(br.insert(4, "Maddy"));

        System.out.println(br.delete(2, 3));

    }
}
