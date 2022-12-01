package section2.hiding;

public class ExerciseDateTest {
    public static void main(String[] args) {
        ExerciseDate date1 = new ExerciseDate(30, 2, 2000);
        System.out.println(date1.isValid());
        ExerciseDate date2 = new ExerciseDate(2, 10, 2006);
        System.out.println(date2.isValid());

    }
}
