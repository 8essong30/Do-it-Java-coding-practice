package section2.staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("홍길동");
        System.out.println(student1.serialNum); // static변수인 serialNum의 초기값 출럭
        student1.serialNum++;  //static 변수값 증가

        Student student2 = new Student();
        student2.setStudentName("이이");
        System.out.println(student2.serialNum); //증가된 값 출력
        System.out.println(student1.serialNum); //증가된 값 출력
        // 두 개의 참조변수가 동일한 변수의 메모리를 가리키고 있음
    }
}
