
// 11 Accept a matrix and display maximum and minimum number from matrix.
import java.util.Scanner;

public class Maximum_Minimum_Number {
    // 1 To accept n numbers ,store into array and display maximum number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min;
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        System.out.println("Enter Elements of Matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n Matrix ");
        for (int i = 0; i < r; i++) { // row no of times
            for (int j = 0; j < c; j++) { // column no of times
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        max = a[0][0];
        min = a[0][0];
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                } else if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("Maximum value in the Matrix is : " + max);
        System.out.println("Minimum value in the Matrix is : " + min);
        sc.close();
    }
}
