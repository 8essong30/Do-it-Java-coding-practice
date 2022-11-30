package chapter2.operator;

public class OperationEx1 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScroe = 70;

        int totalScore = mathScore + engScroe;
        System.out.println(totalScore);

        double avgScore = totalScore / 2.0;
        System.out.println(avgScore);

        int gameScore = 150;

        int lastScore1 = ++gameScore;  // gameScore값도 1을 더한 값으로 변경됨
        System.out.println(lastScore1);

        int lastScore2 = --gameScore;
        System.out.println(lastScore2);
    }
}

