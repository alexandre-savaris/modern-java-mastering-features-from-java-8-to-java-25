import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {

        // Imperative.
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Imperative = " + sum);

        // Declarative.
        sum = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Declarative = " + sum);
    }
}
