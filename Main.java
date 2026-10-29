package lab01;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Counter counter = new Counter();

        System.out.println("Square of 5 = " + calc.square(5));
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("Count up to 10 = " + counter.countUpTo(10));
    }
}