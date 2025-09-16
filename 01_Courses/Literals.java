public class Literals {
    public static void main(String[] args) {
        
        int number=0b101 ;
        System.out.println("The number "+ number);

        long data=0x1E;
        System.out.println("The data  "+ data);

        double data1=12e12;
        System.out.println("The data1 "+data1);

        double d=1_00_00_000;
        System.out.println(d);

        char c='a';
        c++;
        System.out.println("The value of c " +c);
    }
}
