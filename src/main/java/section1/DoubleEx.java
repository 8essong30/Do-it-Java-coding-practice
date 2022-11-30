package chapter2;

public class DoubleEx {
    public static void main(String[] args) {
        double dnum = 3.14;
        float fnum = 3.14F;

        System.out.println(dnum);  //3.14
        System.out.println(fnum);  //3.14

        double dnum2 = 1;

        for (int i = 0; i < 10000; i++) {
            dnum2 = dnum2 + 0.1;
        }
        System.out.println(dnum2); //10001이 아님, 부동 소수점 방식의 오류
    }
}
