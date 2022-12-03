package section2.arraylist;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String name;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        subjectList = new ArrayList<Subject>();
    }
    public void addSubject(String name, int scorePoint){
        Subject subject = new Subject(name, scorePoint);
        subjectList.add(subject);
    }
    public void showStudentInfo(){
        int total = 0;
        for(Subject s : subjectList){
            total += s.getScorePoint();
            System.out.println("학생 "+ name + "의 "+ s.getSubjectName() + " 과목 성적은 "+ s.getScorePoint()+"입니다.");
        }
        System.out.println("학생 "+name+"의 총점은 "+total+"입니다.");
    }
}
