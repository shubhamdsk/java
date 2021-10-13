// Maximum Between Two Numbers..

import java.util.Scanner;
public class Max_Between_Two 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Elements a & b Respectively : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a>b) {
                System.out.println("a is greater than b");
            } 
        else {
                System.out.println("b is greater than a");
            }
            sc.close();
    } 
}