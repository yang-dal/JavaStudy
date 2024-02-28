package abstractclasspractice.creature;

public class Kevin extends Human implements Programer, Swimable {
    public Kevin(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void coding() {
        System.out.println("Hello, World! Java!!");
    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY() - yDistance);
        if (getY() < -10) {
            System.out.println("너무 깊어서 죽을 수도 있어...");
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Kevin -> " + toString());
    }
}
