//First N Even Numbers 0,2,4,6......

import java.util.Scanner;
public class First_N_Even_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size : ");
        int n = sc.nextInt();

        System.out.printf("The first %d even numbers are \n",n);
        for (int i = 0; i <= n ; i++) {

            if (i % 2 == 0) {
                System.out.print(i +"\t");
            }
        }
        sc.close();
    }
}
