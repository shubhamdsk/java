// Display number in words.. E.g i/p : 268 o/p: Two Six Eight

import java.util.Scanner;
public class Number_in_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
    
         int rem, rev = 0;
         
         while (n!=0) {
             rem = n % 10;
             rev = rev * 10 + rem ;
             n = n / 10;
         }
         while (rev != 0) 
         {
             switch (rev % 10) {
                 case 0:
                     System.out.print("Zero ");
                     break;
                 case 1:
                     System.out.print("One ");
                     break;
                 case 2:
                     System.out.print("Two ");
                     break;
                 case 3:
                     System.out.print("Three ");
                     break;
                 case 4:
                     System.out.print("Four ");
                     break;
                 case 5:
                     System.out.print("Five ");
                     break;
                 case 6:
                     System.out.print("Six ");
                     break;
                 case 7:
                     System.out.print("Eeven ");
                     break;
                 case 8:
                     System.out.print("Eight ");
                     break;
                 case 9:
                     System.out.print("Nine ");
                     break;
             }
             rev = rev/10; 
         }
         sc.close();
    }  
}
