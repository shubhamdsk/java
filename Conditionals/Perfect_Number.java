// Display the Perfect Number.....

import java.util.Scanner;
public class Perfect_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int Sum = 0;

        for (int i = 1; i < n ; i++) {
            if (n % i ==0) {
                Sum = Sum + i;
            }
        }
        if (Sum == n) {
            System.out.println(n +" Is a Perfect Number..!");
        } else {
            System.out.println(n +" Is not a Perfect Number..!");
        }
        sc.close();
    }
}
// 6,28,496,8128,............