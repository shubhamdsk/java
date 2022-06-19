import java.util.*;

class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, String> ht = new Hashtable<>();
        System.out.println("How many empoyee: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Id : ");
            int id = sc.nextInt();

            System.out.println("Enter name : ");
            String name = sc.next();

            ht.put(id, name);

        }
        System.out.println("Employee Details : " + ht);
        sc.close();
    }
}