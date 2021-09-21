import java.util.Scanner;

public class ReverseNoInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number >: ");
        long number = sc.nextLong();
        long rem, rev = 0;
        while (number != 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;

        }
        System.out.println("The reverse no is : " + rev);
    }

}

/*
 * PS D:\java\Conditionals Programs> javac ReverseNoInJava.java PS
 * D:\java\Conditionals Programs> java ReverseNoInJava Enter the number >: 98765
 * The reverse no is : 56789
 */