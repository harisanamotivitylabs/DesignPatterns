package test;

class Person{
    String name="hari";
    String name2="hari";
}
public class Test {
    public static void main(String[] args) {

        Person person=new Person();
        Person person1=new Person();
        person1.name="bhaskar";
        person1.name.equals(person.name);

    }
}
