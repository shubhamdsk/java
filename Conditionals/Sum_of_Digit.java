// Display sum of Digits... i.e. 3+5+2 = 10.

import java.util.Scanner;

public class Sum_of_Digit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        int sum = 0;
        int t1 = n;

        while (t1 != 0) {
            int LastDigit = t1 % 10;
            sum += LastDigit;
            t1 /=10;
        }
        System.out.printf("Sum of digits of number is %d is %d ", n,sum);
        sc.close();
    }
}