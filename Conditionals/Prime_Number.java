// Check given number is prime or not.

import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int temp = 0;

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                temp = temp + 1;  
            }           
        }
        if (temp > 0) {
            System.out.println("The Number is not Prime");
        } else {
            System.out.println("The Number is Prime");
        }
        sc.close();
    }
}
