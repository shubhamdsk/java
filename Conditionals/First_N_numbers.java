//First N Numbers 0 1 2 3 4 5.....

import java.util.Scanner;
public class First_N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size : ");
        int n = sc.nextInt();

        System.out.printf("The first %d numbers are \n",n);
        
        for (int i = 0; i < n; i++) {
            System.out.print(i +"\t");
        }
        sc.close();
    }
}
