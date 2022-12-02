package section2.staticex;

public class Student {
    public static int serialNum = 1000; //모든 인스턴스가 공유하는 변수. 인스턴스 생성과 상관 없이 먼저 생성됨
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public Student() {
        serialNum ++;  //학생 생성시 증가
        studentID = serialNum;  //증가된 값을 ID에 부여
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }
}
