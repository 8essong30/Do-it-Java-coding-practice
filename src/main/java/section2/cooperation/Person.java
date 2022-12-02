package section2.cooperation;

public class Person {

    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buy(Cafe cafe) {
        cafe.pay(cafe.menuCost);
        this.money -= cafe.menuCost;
    }
}
