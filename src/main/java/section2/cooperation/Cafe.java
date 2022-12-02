package section2.cooperation;

public class Cafe {
    String cafeName;
    String menu;
    int menuCost;
    int money;

    public Cafe(String cafeName, String menu, int menuCost) {
        this.cafeName = cafeName;
        this.menu = menu;
        this.menuCost = menuCost;
    }

    public void pay(int menuCost) {
        this.money += menuCost;
    }
}
