class TypeConversionCasting{
    public static void main(String args[]){


        byte be= 127;
        int number1=257;
        be=(byte)number1;
        System.out.println("The casting of int to byte : "+ be);

        float f=5.6f;
        int number=(int)f;
        System.out.println("The casting of float to int : "+ number);

        byte a=10;
        byte b=30;
        int result =a*b;
        System.out.println("The Result is : "+ result);
    }
}