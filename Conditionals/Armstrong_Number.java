// Check given number is Armstrong or not.

import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int leng = 0 ;
        int t1 = n;
        
        while (t1 != 0) {
            t1 = t1 / 10;  
            leng = leng + 1;
        }

        int t2 = n;
        int arm = 0;
        int rem;

        while (t2 != 0) {
            int mult = 1;
            rem = t2 % 10; 
            for (int i = 1; i <= leng; i++) {
                mult = mult * rem ; 
            } //end loop
            arm = arm + mult ; 
            t2 = t2 / 10 ;
        }
        if (arm == n) {
            System.out.println("The given number is armstrong..!");
        }//end if
         else {
            System.out.println("The given number is not armstrong..!");
        }
        sc.close();
    }
    
}
