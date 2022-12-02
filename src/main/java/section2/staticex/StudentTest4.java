package section2.staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 stu = new Student2();
        stu.setStudentName("이순신");
        System.out.println(Student2.getSerialNum());  //클래스 이름으로 get()메서드 직접호출
        System.out.println(stu.studentName + " 학번: "+ stu.studentID);

        Student2 dent = new Student2();
        dent.setStudentName("성룡");
        System.out.println(Student2.getSerialNum());  // 인스턴스 생성 없이 호출 가능
        System.out.println(dent.studentName + " 학번: "+ dent.studentID);

    }
}
