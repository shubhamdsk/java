// Minimum Between Three Numbers..

import java.util.Scanner;
public class Min_Between_Three
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers a , b, c Respectively  : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b>a && c>a) {
                System.out.println("a is minimum number amongst of b and c that is : " +a);
            } 
            else if (c>b) {
                    System.out.println("b is minimum number amongst of a and c that is : " +b);
                }
            else{
                    System.out.println("c is minimum number amongst of a and b that is : " +c);
                }  
                sc.close();
    }
}