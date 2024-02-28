package firstweekexercise.carremotecontrol;

public class Car extends AbstractCar {
    @Override
    public void unLock() { System.out.println("문이 열렸습니다."); }

    @Override
    public void lock() { System.out.println("문이 잠겼습니다."); }

    @Override
    public void startEngine() { System.out.println("시동을 켭니다."); }

    @Override
    public void stopEngine() { System.out.println("시동을 끕니다."); }

    @Override
    public void honk() { System.out.println("경적을 울립니다."); }

    @Override
    public void openTrunk() { System.out.println("트렁크를 엽니다."); }

    @Override
    public void autoParking() { System.out.println("자동주차 시작!"); }
}
