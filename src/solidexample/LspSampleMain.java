package solidexample;

public class LspSampleMain {
    public static void main(String[] args) {
        CanNotFlyBird ostrich = new Ostrich();
        makeBirdFly(ostrich); // 예외 발생!
    }

    static void makeBirdFly(CanNotFlyBird bird) {
        bird.walk(); // throws 감지 불가능
    }
}

class CanFlyBird {
    void fly() {
        // 새가 날아감
    }
}

class CanNotFlyBird {
    void walk() {
        // 새가 걸음
    }
}

class Ostrich extends CanNotFlyBird {
    void fly() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("타조는 날지 못합니다.");
    }
}