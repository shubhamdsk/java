public class sumofnaturalnumber {
	static int sum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int result = sum(5);
		System.out.println("The Sum of Natural Number : " + result);

	}
}

/* 
    PS D:\java\Conditionals Programs> javac sumofnaturalnumber.java
    PS D:\java\Conditionals Programs> java sumofnaturalnumber      
    The Sum of Natural Number : 15
*/
