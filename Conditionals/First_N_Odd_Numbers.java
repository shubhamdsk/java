//First N Odd Numbers 1 3 5 7 .........

import java.util.Scanner;

public class First_N_Odd_Numbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size : ");
        int n = sc.nextInt();

        System.out.printf("The first %d Odd numbers are \n",n);
        for (int i = 0; i <= n ; i++) {

            if (i % 2 != 0) {
                System.out.print(i +"\t");
            }
        }
        sc.close();
    }
}
