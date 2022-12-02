package section2.cooperation;

public class ExerciseQ5 {
    public static void main(String[] args) {
        Person person = new Person("김씨", 5000);
        Cafe cafe  = new Cafe("별다방", "아메리카노", 4000);
        person.buy(cafe);
        cafe.pay(cafe.menuCost);
        System.out.println(person.name + "는 "+cafe.menuCost+"원을 내고 "+cafe.cafeName+"에서 "+cafe.menu+"를 사먹었다. 남은 돈: "+person.money);

        Person person2 = new Person("이씨", 5000);
        Cafe cafe2  = new Cafe("콩다방", "라떼", 4500);
        person2.buy(cafe2);
        cafe2.pay(cafe2.menuCost);
        System.out.println(person2.name + "는 "+cafe2.menuCost+"원을 내고 "+cafe2.cafeName+"에서 "+cafe2.menu+"를 사먹었다. 남은 돈: "+person2.money);
    }
}
