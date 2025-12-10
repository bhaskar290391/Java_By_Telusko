package OOPS;

public class ArraysDemo {
    public static void main(String[] args) {
        int nums[] = new int[5];
        nums[0] = 5;
        nums[1] = 50;
        nums[2] = 36;
        nums[3] = 85;
        nums[4] = 45;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("The element of data inside the arrays " + nums[i]);
        }
    }
}
