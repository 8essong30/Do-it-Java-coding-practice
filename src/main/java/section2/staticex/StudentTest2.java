package section2.staticex;

public class StudentTest2 {
    public static void main(String[] args) {
        Student student1 = new Student(); // Student생성자를 통해 생성될 때마다 학번이 증가함
        student1.setStudentName("오성");
        System.out.println(student1.serialNum);  // 인스턴스 참조변수가 아닌 클래스 이름으로 직접 참조하라고 노랗게 알려줌
        System.out.println(student1.studentName + " 학번: " + student1.studentID);

        Student student2 = new Student();
        student2.setStudentName("한음");
        System.out.println(student2.serialNum);
        System.out.println(student2.studentName + " 학번: "+ student2.studentID);
    }
}
// 위 코드를 이렇게 변경 가능
//public class StudentTest3{
//    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.setStudentName("오성");
//        System.out.println(Student.serialNum); //serialNum 변수를 직접 클래스 이름으로 참조
//        System.out.println(student1.studentName + " 학번: " + student1.studentID);
//
//        Student student2 = new Student();
//        student2.setStudentName("한음");
//        System.out.println(Student.serialNum); //serialNum 변수를 직접 클래스 이름으로 참조
//        System.out.println(student2.studentName + " 학번: "+ student2.studentID);
//    }
//}