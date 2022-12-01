package section2.classpart;

public class ExamplePerson {
    int age;
    String name;
    boolean isMarried;
    int childrenNumber;  // numberOfChildren

    public static void main(String[] args) {
        ExamplePerson person = new ExamplePerson();
        person.name = "James";
        person.age = 40;
        person.isMarried = true;
        person.childrenNumber = 3;

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.isMarried);
        System.out.println(person.childrenNumber);
    }
}
