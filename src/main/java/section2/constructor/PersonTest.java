package section2.constructor;

public class PersonTest {
    public static void main(String[] args) {
        //두가지 생성자 중 선택해 사용 가능
        Person person1 = new Person(); // 디폴트 생성자로 클래스 생성
        person1.height = 180;          //인스턴스 변수 값 초기화
        person1.name  = "갬개똥";
        person1.weight = 50;

        Person person = new Person("name"); // 매개변수로 받아 클래스 생성
        Person person2 = new Person(80.5F, 180);
    }
}
