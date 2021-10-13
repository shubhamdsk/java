
// 12 Accept n and display nXn identity matrix.
import java.util.Scanner;

public class Identity_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total rows in Array :");
        int r = sc.nextInt();
        System.out.println("Enter total column in Array :");
        int c = sc.nextInt();

        System.out.println("Identity Matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
