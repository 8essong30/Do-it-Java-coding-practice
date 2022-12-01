package section2.hiding;

//이렇게 private로 바꾸고 public메서드 별도 제공하면 된느거지
public class ExampleCorrection {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        if (month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("오류입니다");
            } else {
                this.day = day;
            }
        }
    }
}
