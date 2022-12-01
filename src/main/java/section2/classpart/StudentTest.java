package section2.classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "홍길동";  // 참조변수.멤버변수

        Student student2 = new Student();
        student2.studentName = "김철수";

        System.out.println(studentAhn.getStudentName()); //참조변수.메서드
        System.out.println(student2.getStudentName());

        //클래스이름@주소값 출력 주소값==hash code값
        System.out.println(studentAhn);
        System.out.println(student2);
    }
}
