
// 2 To accept n numbers ,store into array and display minimum number.
import java.util.Scanner;

public class Minimum_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, n;
        System.out.println("Enter the size of Array :");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Elements of Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum value in the Array is : " + min);
        sc.close();
    }
}