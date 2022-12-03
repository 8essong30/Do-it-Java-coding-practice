package section2.array;

public class StudentExample {
    private static int serialNum = 1000;
    private int studentID;
    private String name;

    public StudentExample(String name) {
        serialNum++;
        this.studentID = serialNum;
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void showStudentInfo(){
        System.out.println(studentID + ", "+ name);
    }
}
