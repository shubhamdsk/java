
//4 To accept n numbers ,store into array and display sum of all even numbers and sum of all odd numbers.
import java.util.Scanner;

public class Sum_of_Even_Odd_Numbers {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Numbers");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        int oddSum = 0, evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }

        System.out.println("\nSum of Odd numbers : \n" + oddSum);
        System.out.println("Sum of Even numbers : \n" + evenSum);
        sc.close();
    }
}
