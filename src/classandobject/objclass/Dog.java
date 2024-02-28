package classandobject.objclass;

public class Dog {
    // 멤버 변수
    public String name;
    public int age;
    public int agespecial;


    // 생성자
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드
    public void bark() {
        System.out.println("Woof! My name is " + name + " and I'm " + age + " years old.");
    }
}
