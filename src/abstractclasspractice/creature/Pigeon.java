package abstractclasspractice.creature;

import java.time.Year;
import java.util.Set;

public class Pigeon extends Animal implements Flyable {
    public Pigeon(int x, int y, int age) {
        super(x, y, age);
    }
    @Override
    public void fly(int yDistance) {
        setY(getY() + yDistance);
    }

    @Override
    public void flyMove(int xDistance, int yDistance) {
        setY(getY() + yDistance);
        setX(getX() + xDistance);
    }

    @Override
    public void printInfo() {
        System.out.println("Pigeon -> " + toString());
    }
}
