//Check Number is Positive or Negative 

import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   

        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        
        if (n > 0) {
                System.out.println(n + " is Positive");
            } 
        else {
                System.out.println(n + " is Negative");
            }
            sc.close();
    } 
}