package chapter2.operator;

import java.sql.SQLOutput;

public class OperationEx3 {
    public static void main(String[] args) {
        int fatherAge = 55;
        int motherAge = 53;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F'; // 조건연산자

        System.out.println(ch);

    }
}
