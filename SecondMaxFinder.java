package javaAssignment;


public class SecondMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {30, 17, 01, 91, 50, 16};
        int secondMax = findSecondMax(numbers);
        System.out.println("The second maximum number is: " + secondMax);
    }
    
    public static int findSecondMax(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
