package section2.hiding;

/*
변수를 public으로 선언하는 것과 private로 선언하는 이유?
 public으로 선언하게 되면
접근이 제한되지 않으므로 정보의 오류가 발생할 수 있음
따라서
오류가 나더라도 그 값이 해당 변수에 대입되지 못하도록
(정보 오류 발생을 막기 위해)
private로 선언하고 public 메서드 별도 제공

 */

public class Student {
    int studentID;
    private String studentName;
    int grade;
    String address;


    // private로 선언한 ~Name변수를 외부 코드에서 사용하기 위한(외부 클래스에서 접근하기 위한) 메서드
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

