import java.util.function.Predicate;

public class PredicateExample1 {

    public static void main(String[] args) {

        Predicate<Integer> predicate = (n) -> n % 2 == 0;
        System.out.println(predicate.test(2));

        System.out.println("===================================================");

        Predicate<Integer> predicate1 = (n) -> n % 5 == 0;
        System.out.println(predicate.and(predicate1).test(8));

        System.out.println("===================================================");

        System.out.println(predicate.or(predicate1).test(8));

        System.out.println("===================================================");

        System.out.println(predicate.or(predicate1).negate().test(8));
    }
}
