package javaAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        System.out.print("Enter 1 for ascending order or 2 for descending order: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            Arrays.sort(array1);
            Arrays.sort(array2);
        } else if (choice == 2) {
            Arrays.sort(array1);
            Arrays.sort(array2);
            reverse(array1);
            reverse(array2);
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }
        
        System.out.println("Sorted first array: " + Arrays.toString(array1));
        System.out.println("Sorted second array: " + Arrays.toString(array2));
        
        scanner.close();
    }
    
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
