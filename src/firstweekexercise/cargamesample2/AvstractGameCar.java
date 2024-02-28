package firstweekexercise.cargamesample2;

public abstract class AvstractGameCar implements IMovementControllable, ISpecModifiable {
    int maxSpeed;
    int currentSpeed;
    String color;
    abstract int getMaxSpeed();
    abstract String getColor();
    abstract String getSignal(String InputSignal);
    abstract void interpreSignal(String signal);
}
