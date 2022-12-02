package section2.staticex;

public class Student5 {
    private static int serialNum;
    int studentID;
    String name;

    public Student5(String name) {
        serialNum ++;
        this.studentID = serialNum + 100;
        this.name = name;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public String getName() {
        return name;
    }
}
