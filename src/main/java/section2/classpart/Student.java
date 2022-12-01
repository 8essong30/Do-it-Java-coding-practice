package section2.classpart;

public class Student {
    // 멤버변수
    int studentID;
    String studentName;
    int grade;
    String address;

    //멤버 함수; 멤버변수 사용 클래스 구현
    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}

