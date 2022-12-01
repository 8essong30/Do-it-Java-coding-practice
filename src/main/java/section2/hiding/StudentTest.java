package section2.hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
//        student.studentName = "이이"; //오류발생. studentName이 private로 되어있기 때문. 외부 클래스의 접근 불가
        student.setStudentName("이이");
        System.out.println(student.getStudentName());
    }
}
