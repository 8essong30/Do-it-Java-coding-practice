package chapter2;

public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum3 = (int)dNum + (int)fNum;
        int iNum4 = (int)(dNum + fNum);
        System.out.println(iNum4);
        System.out.println(iNum3);

    }
}
