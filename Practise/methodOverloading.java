class sum {
    public int add(int x, int y) {
        int sum = x + y;

        System.out.println(sum);
        return 0;
    }

    public int add(int x) {
        int sum = x + 10;
        System.out.println(sum);
        return 0;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        sum s = new sum();

        // first method will be called who has just two parameter
        s.add(5, 3);

        // second method will be called who has just one parameter
        s.add(3);

    }
}
