package section2.thisex;


class Person {
    String name;
    int age;

    // 매개변수를 가지는 생성자
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //디폴트생성자
    Person() {
//        this.name = "noname"     //this로 생성자 호출할 때 이전에 다른 코드 넣을 수 없음
        this("무명", 1); //this로 Person(String name, int age) 생성자 호출
    }

    Person returnItSelf() {
        return this;  //this 반환
    }

}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();   // Person()디폴트 생성자 호출
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person p = noName.returnItSelf(); //this 값 변수 대입
        System.out.println(p);            //this 값 == 주소값
        System.out.println(noName);       // 같은거임
    }
}
