package section2.staticex;

import java.sql.SQLOutput;

public class StudentTest5 {
    public static void main(String[] args) {
        Student5 student5 = new Student5("이산");
        System.out.println(Student5.getSerialNum());
        System.out.println(student5.getName() + " 학생카드번호: "+ student5.studentID);

        Student5 student51 = new Student5("이황");
        System.out.println(Student5.getSerialNum());
        System.out.println(student51.getName() + " 학생카드번호: "+student51.studentID);
    }
}
