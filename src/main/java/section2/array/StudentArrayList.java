package section2.array;

import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<StudentExample> students = new ArrayList<StudentExample>();

        students.add(new StudentExample("James"));
        students.add(new StudentExample("Tomas"));
        students.add(new StudentExample("Edward"));

        for(StudentExample studentExample : students){
            studentExample.showStudentInfo();
        }
    }
}
