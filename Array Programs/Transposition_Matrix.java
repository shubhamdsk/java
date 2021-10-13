
// To Display transpose matrix of given matrix
import java.util.Scanner;

public class Transposition_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total rows in Array :");
        int r = sc.nextInt();
        System.out.println("Enter total column in Array :");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];

        System.out.println("Enter Elements of Array 1: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe Matrix");
        for (int i = 0; i < r; i++) { // row no of times
            for (int j = 0; j < c; j++) { // column no of times
                System.out.print(mat[i][j] + " ");

            }
            System.out.println(" ");
        }

        System.out.println("\nThe Transposition Matrix");
        for (int i = 0; i < r; i++) { // row no of times
            for (int j = 0; j < c; j++) { // column no of times
                System.out.print(mat[j][i] + " ");

            }
            System.out.println(" ");
        }
        sc.close();
    }
}
/* Code provided by Deshmukh Shubham */