package section2.singleton;

public class Car {
    private static int serialNum = 10000;
    private final int carNum;

    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }
}
