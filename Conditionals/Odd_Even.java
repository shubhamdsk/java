//Check Number is Odd Or Even..
// Check given number is Odd or Even.

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Elements : ");
        int no = sc.nextInt();
        
        if (no % 2 ==0) {
                System.out.println(no + " is Even");
            } 
        else {
                System.out.println(no + " is Odd");
            }
            sc.close();
    }
}