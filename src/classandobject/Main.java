package classandobject;

import classandobject.objclass.Dog;

public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Dog myDog0 = new Dog("Buddy0", 3);
        Dog myDog1 = new Dog("Buddy1", 3);
        Dog myDog2 = new Dog("Buddy2", 3);
        Dog myDog3 = new Dog("Buddy3", 3);

        // 객체 사용
        myDog0.bark();
        myDog1.bark();
        myDog2.bark();
        myDog3.bark();
    }
}