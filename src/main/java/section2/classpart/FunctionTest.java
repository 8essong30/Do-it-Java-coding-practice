package section2.classpart;

public class FunctionTest  {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int result1 = add(num1, num2);// add함수 호출
        int result2 = substract(num1, num2);
        int result3 = times(num1, num2);
        int result4 = divide(num1, num2);
        System.out.println(num1 + " + " + num2 +"= " + result1);
        System.out.println(num1 + " - " + num2 +"= " + result2);
        System.out.println(num1 + " X " + num2 +"= " + result3);
        System.out.println(num1 + " / " + num2 +"= " + result4);

    }

    public static int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    public static int substract(int n1, int n2){
        int result = n1 - n2;
        return result;
    }

    public static int times(int n1, int n2){
        int result = n1 * n2;
        return result;
    }

    public static int divide(int n1, int n2){
        int result = n1 / n2;
        return result;
    }

}
