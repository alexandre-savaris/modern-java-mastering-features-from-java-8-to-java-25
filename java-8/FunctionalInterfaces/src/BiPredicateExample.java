import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

        studentList.forEach((s) -> {
            if (biPredicate.test(s.getGradeLevel(), s.getGpa())) {
                System.out.println(s);
            }
        });
    }
}
