package OOPS.Exercise;

public class ArrayExercise {

    public static void main(String[] args) {

        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16,
        // 90, and 33
        int nums[] = { 45, 22, 89, 16, 90, 33 };

        // TODO: Initialize min and max with the first element
        int max = nums[0];
        int min = nums[0];
        // TODO: Use an enhanced for loop to find min and max

        for (int num : nums) {

            if (num > max) {
                max = num;
            }
        }

        for (int num : nums) {

            if (num < min) {
                min = num;
            }
        }

        // TODO: Print the smallest and largest numbers
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
