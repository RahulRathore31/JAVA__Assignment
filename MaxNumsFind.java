package javaAssignment;


public class MaxNumsFind {
    public static void main(String[] args) {
        int[] numbers = {3, 20, 1, 19, 50, 6};
        int maxNumber = findMax(numbers);
        System.out.println("The maximum number is: " + maxNumber);
    }
    
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
