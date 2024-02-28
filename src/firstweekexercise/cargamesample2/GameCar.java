package firstweekexercise.cargamesample2;

public class GameCar extends AvstractGameCar{

    public GameCar(){
        this.maxSpeed = 10;
        this.color = "흰색";
    }

    public GameCar(int maxSpeed, String color) {
        setMaxSpeed(maxSpeed);
        setColor(color);
    }

    @Override
    int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }

    @Override
    String getColor() {
        return this.color;
    }

    @Override
    String getSignal(String InputSignal) {
        return InputSignal;
    }

    @Override
    public void setColor(String color) {
        this.color = color;

    }

    @Override
    void interpreSignal(String signal) {
        switch (signal) {
            case "acc": {
                accelerate();
                break;
            }
            case "brk": {
                breakSlower();
                break;
            }
            case "lefr": {
                turnleft();
                break;
            }
            case "right": {
                turnright();
                break;
            }
        }
    }

    @Override
    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            this.currentSpeed++;
            System.out.printf("가속합니다 (현재속도 %d)\n", this.currentSpeed);
        }
        else {
            System.out.printf("최대 속도입니다 (현재속도 %d)\n", this.currentSpeed);
        }

    }

    @Override
    public void breakSlower() {
        if (currentSpeed > 0) {
            this.currentSpeed--;
            System.out.printf("감속합니다 (현재속도 %d)\n", this.currentSpeed);
        }
        else {
            System.out.printf("정지했습니다 (현재속도 %d)\n", this.currentSpeed);
        }
    }

    @Override
    public void turnleft() {

    }

    @Override
    public void turnright() {

    }
}
