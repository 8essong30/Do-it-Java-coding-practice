package section2.cooperation;

public class Taxi {
    int money;

    public Taxi() {
        this.money = money;
    }

    public void take(int money){
        this.money += money;
    }

    public void showInfo(){
        System.out.println("택시의 수입은 "+ money + "원 입니다.");
    }
}
