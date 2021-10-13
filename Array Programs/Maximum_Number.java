
//  To accept n numbers ,store into array and display maximum number.
import java.util.Scanner;

public class Maximum_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, n;
        System.out.println("Enter size of Array :");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Elements of Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum value in the Array is : " + max);
        sc.close();
    }
}
/* Code provided by Deshmukh Shubham */