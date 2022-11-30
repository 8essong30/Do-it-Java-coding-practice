package chapter2.operator;

public class OperationEx2 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        //논리 합
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i +2) < 10); //앞 항의 결과가 false라 두번째 항 실행 안됨
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); // 그래서 i값 고대로 2

        //논리 곱
        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // 앞 항의 결과가 참이므로 뒷 항 실행 안됨
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); // 그래서 i값 고대로 2
    }
}

