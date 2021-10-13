// Display alphabets e.g. n= 4 o/p: Aa Bb Cc Dd

public class alphabet {
    public static void main(String[] args) {
    
        int n = Integer.parseInt(args[0]);
        int j = 0;
        n = n + 65;

        for (int i = 65; i < n; i++) {
            j = i + 32;
            System.out.printf("%c%c ",i,j);
        }
    }
    
}
