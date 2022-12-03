package section2.arraylist;

public class Subject {
    private String subjectName;
    private int scorePoint;

    public Subject(String subjectName, int scorePoint) {
        this.subjectName = subjectName;
        this.scorePoint = scorePoint;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getScorePoint() {
        return scorePoint;
    }
}
