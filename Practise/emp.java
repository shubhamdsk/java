import java.math.BigInteger;
import java.util.*;

public class emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, BigInteger> ht = new Hashtable<>();
        System.out.println("How many empoyee: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name : ");
            String name = sc.next();
            

            System.out.println("Enter Phone No : ");
            BigInteger no = sc.nextBigInteger();

            ht.put(name,no);

        }
        System.out.println("Employee Details : " + ht);
        sc.close();
    }
}