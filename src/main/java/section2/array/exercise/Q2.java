package section2.array.exercise;

// 알파벳 출력 예제에서 각 요소 값을 소문자에서 대문자로 변환
public class Q2 {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++, ch++){
            char lower = (char) (ch + 32);
            alphabets[i] = lower;
            System.out.println(lower);
        }
    }
}
