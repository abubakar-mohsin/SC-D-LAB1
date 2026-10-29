package lab01;

public class Counter {

    public int countUpTo(int limit) {
        int count = 0;
        for (int i = 1; i <= limit; i++) {
            count++;
        }
        return count;
    }
}