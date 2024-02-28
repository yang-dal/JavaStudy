package firstweekexercise.carremotecontrol;

public abstract class AbstractCar implements ICarRemoteControllable {
    public abstract void unLock();
    public abstract void lock();
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void honk();
    public abstract void openTrunk();
    public abstract void autoParking();

}
