public class TypeConversionCasting{
    public static void main(String[] args) {
        

        byte data=127;
        int b=258;
        data = (byte)b;
        System.out.println(data);


        float f=5.6f;
        int a= (int) f;
        System.out.println("The value of a "+a);

        //type promotion
        byte num1=10;
        byte num2=20;

        int result=num1*num2;

        System.out.println(result);

    }
}