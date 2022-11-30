package section1.loop;

public class Question {
    void Question1 {

        int num1 = 10;
        int num2 = 2;
        char operator = '/';
        int i;

        if (operator == '+'){
            i = num1 + num2;
        } else if (operator == '-') {
            i = num1 - num2;
        } else if (operator == '*') {
            i = num1 * num2;
        } else if (operator == '/') {
            i = num1 / num2;
        }
        System.out.println(i);
    }
}
