package section2.staticex;

public class Student2 {
    private static int serialNum = 1000;  //private 변수로 변경
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student2() {
        serialNum ++;  //학생 생성시 증가
        studentID = serialNum;  //증가된 값을 ID에 부여
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static int getSerialNum() {
        int i = 10;  //지역변수; 메서드 내부에서만 사용; 호출 시 메모리 생성, 메서드 종류 후 사라짐
//        studentName = "이이"; //오류; 클래스의 멤버변수로 인스턴스 생성 시 만들어지는 인스턴스 메서드
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
