package javaAssignment;
import java.util.Scanner;

public class TwoDArr_AddSubMul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];
        
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Addition:");
        addMatrices(matrix1, matrix2, result);
        printMatrix(result);
        
        System.out.println("Subtraction:");
        subtractMatrices(matrix1, matrix2, result);
        printMatrix(result);
        
        System.out.println("Multiplication:");
        multiplyMatrices(matrix1, matrix2, result);
        printMatrix(result);
        
        scanner.close();
    }
    
    public static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] result) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }
    
    public static void subtractMatrices(int[][] matrix1, int[][] matrix2, int[][] result) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
    }
    
    public static void multiplyMatrices(int[][] matrix1, int[][] matrix2, int[][] result) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
