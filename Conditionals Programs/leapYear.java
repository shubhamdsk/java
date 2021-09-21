import java.util.Scanner;

class leapYear {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Year >: ");
		long year = sc.nextLong();

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
		{
			System.out.printf("%d is Leap Year\n", year);
		} else 
		{
			System.out.printf("%d is not a Leap Year\n", year);
		}
	}
}
/*
	PS D:\java\Conditionals Programs> javac leapYear.java

PS D:\java\Conditionals Programs> java leapYear

Enter the Year >: 
2017
2017 is not a Leap Year
PS D:\java\Conditionals Programs> java leapYear

Enter the Year >: 
2020
2020 is Leap Year
*/