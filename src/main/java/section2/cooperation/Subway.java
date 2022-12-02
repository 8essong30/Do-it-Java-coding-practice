package section2.cooperation;

public class Subway {
    String lineNumber;
    int money;
    int passengerCount;

    public Subway(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount ++;
    }

    public void showInfo(){
        System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money+"원 입니다.");
    }
}

