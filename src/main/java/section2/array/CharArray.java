package section2.array;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for(int i = 0; i<alphabets.length; i++, ch++){
            //ch++ -> 인덱스 i 값이 오를때마다 ch값도 A부터 아스키코드값에 1씩 더해져서 저장되게
            alphabets[i] = ch;
        }

        for(int i = 0; i< alphabets.length; i++){
            System.out.println(alphabets[i] + ", "+(int)alphabets[i]);
        }
    }
}

