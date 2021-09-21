import java.util.Scanner;

class EvenOdd {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the No>: ");
		int number = sc.nextInt();

		if (number % 2 == 0) 
		{
			System.out.printf("%d is Even\n", number);
		} 
		else 
		{
			System.out.printf("%d is Odd\n", number);
		}
	}
}
/*
	D:\java\Conditionals Programs> javac EvenOdd.java

	PS D:\java\Conditionals Programs> java EvenOdd      

	Enter the No>: 
	2
	2 is Even
	PS D:\java\Conditionals Programs> java EvenOdd

	Enter the No>: 
	3
3 is Odd
*/