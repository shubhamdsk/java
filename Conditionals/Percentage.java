// Percentage Calculator..
import java.util.Scanner;
public class Percentage{
    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Maximum marks 100 in each subject");
        
        int a[] = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter "+(i+1)+" Subject mark:");
            a[i] = sc.nextByte();
        }
        
        for (int i = 0; i < 6; i++) {
            sum = sum + a[i];
            
        }
        System.out.println("Total Marks Out of 600 : " +sum);
        int per = sum / 6;

        System.out.println("Percentage(%):");
        System.out.println(per);
        if (per >= 75) {
            System.out.println("Distinction");
        } 
        else if (per >=60 && per < 75) {
            System.out.println("First Class");
        } 
        else if (per >= 50 && per < 60) {
            System.out.println("Second Class");
        }
        else if (per >= 35 && per < 50) {
            System.out.println("pass");
        }
        else if (per<35) {
            System.out.println("Fail....");
        }
        sc.close();
    }
}