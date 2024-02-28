package remotecontrolexample;

public class Main {

    RemoteControl rc = new Television();
    Main() {
    }
    Main(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }
    void methodA() {
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }
    void methodB(RemoteControl rc) {
        rc.turnOn();
        rc.setVolume(5);
    }

    public static void main(String[] args) {
        System.out.println("1)----------------");

        Main myClass1 = new Main();
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        System.out.println("2)----------------");

        Main myClass2 = new Main(new Audio());

        System.out.println("3)----------------");

        Main myClass3 = new Main();
        myClass3.methodA();

        System.out.println("4)----------------");

        Main myClass4 = new Main();
        myClass4.methodB(new Television());
    }
}