/**
 * methodOverriding
 */
class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

class dog extends Animal {
    void sound() {
        System.out.println("bark");
    }
}

public class methodOverriding {

    public static void main(String[] args) {
        System.out.println("Method Overrriding");
        cat c = new cat(); // Method Overrriding
        c.sound();

        dog d = new dog(); // Method Overrriding
        d.sound();

        System.out.println("\nDynamic Method Dispatch");
        Animal a = new cat(); // Dynamic Method Dispatch
        a.sound();

        Animal b = new dog(); // Dynamic Method Dispatch
        b.sound();
    }
}