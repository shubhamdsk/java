
//  To display addition of two matrices .
import java.util.Scanner;

public class Addition_of_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total rows in Array :");
        int r = sc.nextInt();
        System.out.println("Enter total column in Array :");
        int c = sc.nextInt();

        int[][] mat1 = new int[r][c];
        int[][] mat2 = new int[r][c];

        System.out.println("Enter Elements of Array 1: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe Matrix 1");
        for (int i = 0; i < mat1.length; i++) { // row no of times
            for (int j = 0; j < mat1[i].length; j++) { // column no of times
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Enter Elements of Array 2: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe Matrix 2");
        for (int i = 0; i < mat1.length; i++) { // row no of times
            for (int j = 0; j < mat1[i].length; j++) { // column no of times
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println(" ");
        }
        int[][] result = new int[r][c] ;

        for (int i = 0; i < r; i++) { // row no of times
            for (int j = 0; j < c; j++) { // column no of times
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }
        System.out.println("The addition of Mat1 and Mat2");
        for (int i = 0; i < r; i++) { // row no of times
            for (int j = 0; j < c; j++) { // column no of times
                System.out.print(+result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
