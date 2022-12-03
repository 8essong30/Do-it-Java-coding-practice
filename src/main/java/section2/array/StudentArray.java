package section2.array;

public class StudentArray {
    public static void main(String[] args) {
        StudentExample[] student = new StudentExample[3];
        student[0] = new StudentExample("James");
        student[1] = new StudentExample("Tomas");
        student[2] = new StudentExample("Edward");

        for(StudentExample studentExample: student){ //향상된 for문
            studentExample.showStudentInfo();
        }
    }
}
