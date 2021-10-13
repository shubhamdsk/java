// Display alphabets e.g. n= 4 o/p: A B C D

public class Alphabets {
    public static void main(String[] args) {
    
        int n = Integer.parseInt(args[0]);
        n = n +  65;

        for (int i = 65; i < n; i++) {

            System.out.printf("%c ",i);
        }
    }
    
}

