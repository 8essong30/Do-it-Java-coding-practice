package section2.constructor;

public class Person {
    String name;
    float weight;
    float height;

    //생성자 오버로드; 클래스에 생성자가 두 개 이상 제공되는 경우
    public Person() {} // 디폴트생성자

    //매개변수 받아 클래스 생성하는 생성자
    public Person(String pname) {
        name = pname;
    }

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
}

