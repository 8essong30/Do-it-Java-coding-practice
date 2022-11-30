package chapter2.ifExample;

public class GradeByScore {
    public static void main(String[] args) {
        int score = 90;
        char grade;

        if(score == 100 || score >= 90) { // 그냥 (score >= 90) 만 해도 되나보오
            grade = 'A';
        }else if (score >= 80) {
            grade = 'B';
        }else if (score >= 70) {
            grade = 'C';
        }else if (score >= 60) {
            grade = 'D';
        }else grade = 'F';
        System.out.println(grade + "학점입니다.");

    }


}
