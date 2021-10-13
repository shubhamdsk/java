
// 7. Accept a matrix and display sum of all matrix numbers.
import java.util.Scanner;

public class Sum_of_Matrix {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in Array :");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Elements of Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int element : a) {
            sum += element;
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nSum of Array Elements : " + sum);
        sc.close();
    }
}
