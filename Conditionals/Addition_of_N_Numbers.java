// Addition of first N Numbers

import java.util.Scanner;

public class Addition_of_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int sum = 0;
        
        System.out.printf("The Addition  first %d numbers are \n",n);
        
        for (int i = 0; i <= n ; i++) { 
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}
