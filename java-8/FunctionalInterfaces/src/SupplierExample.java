import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> supplier = () -> {
            return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        };
        System.out.println("Supplier result: " + supplier.get());

        System.out.println("===================================================");

        Supplier<List<Student>> supplier1 = () -> {
            return StudentDataBase.getAllStudents();
        };
        System.out.println("Supplier result: " + supplier1.get());
    }
}
