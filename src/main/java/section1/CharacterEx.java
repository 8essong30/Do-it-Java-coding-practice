package chapter2;

public class CharacterEx {
    public static void main(String[] args) {
        // 아스키코드
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);  // 65;

        char ch2 = 66;
        System.out.println(ch2);  // B

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);  // C

        //유티코드
        char ch4 = '한';
        char ch5 = '\uD55C';

        System.out.println(ch4);  // 한
        System.out.println(ch5);  // 한

        int a = 65;
        int b = -66;

        char a2 = 65;
        System.out.println((char)a);
        System.out.println((char)b);
        System.out.println(a);
    }
}
