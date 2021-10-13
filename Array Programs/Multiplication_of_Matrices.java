
// 10 To display multiplication of two matrices .
import java.util.Scanner;

public class Multiplication_of_Matrices {
   public static void main(String args[]) {
      int sum = 0;

      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of first matrix");
      int r1 = in.nextInt();
      int c1 = in.nextInt();

      int first[][] = new int[r1][c1];
      System.out.println("Enter elements of first matrix");
      for (int c = 0; c < r1; c++) {
         for (int d = 0; d < c1; d++) {
            first[c][d] = in.nextInt();
         } // for
      } // for

      System.out.println("The Matrix 1");
      for (int c = 0; c < r1; c++) // row no of times
      {
         for (int d = 0; d < c1; d++) // column no of times
         {
            System.out.print(first[c][d] + " ");
         } // for
         System.out.println(" ");
      } // for

      System.out.println("Enter the number of rows of second matrix (Col of 1st matrix == Rows of 2nd matix)");
      int r2 = in.nextInt();
      System.out.println("Enter the number columns of second matrix ");
      int c2 = in.nextInt();

      if (c1 != r2) {
         System.out.println("The matrices can't be multiplied with each other.");
      } // if end
      else {
         int second[][] = new int[r2][c2];
         int mult[][] = new int[r1][c2];

         System.out.println("Enter elements of second matrix");

         for (int c = 0; c < r2; c++) {
            for (int d = 0; d < c2; d++) {
               second[c][d] = in.nextInt();
            } // for end
         } // for end
         System.out.println("The Matrix 2");
         for (int c = 0; c < r2; c++) // row no of times
         {
            for (int d = 0; d < c2; d++) // column no of times
            {
               System.out.print(second[c][d] + " ");
            } // for end
            System.out.println(" ");
         } // for end

         for (int c = 0; c < r1; c++) {
            for (int d = 0; d < c2; d++) {
               for (int k = 0; k < r2; k++) {
                  sum = sum + first[c][k] * second[k][d];
               } // for end
               mult[c][d] = sum;
               sum = 0;
            } // for end
         } // for end

         System.out.println("Product of the matrices:");

         for (int c = 0; c < r1; c++) {
            for (int d = 0; d < c2; d++)
               System.out.print(mult[c][d] + "\t");

            System.out.print("\n");
         } // for end

      } // else end
      in.close();

   }// main end
}// class end