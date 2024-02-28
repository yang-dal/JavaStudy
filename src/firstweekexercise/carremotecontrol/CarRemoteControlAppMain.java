package firstweekexercise.carremotecontrol;

import java.util.Scanner;

public class CarRemoteControlAppMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car car = new Car();

        System.out.println("사용자 이름을 입력해주십시오.");
        String username = scan.nextLine();
        System.out.println("반갑습니다! "+username+"님! "+"자동차 모델명을 입력하세요.");
        String carname = scan.nextLine();
        System.out.println(username+"님의 "+carname+" 리모컨 App");
        System.out.println("사용법 안내해드리겠습니다!\n");
        System.out.println("|==========================|");
        System.out.println("|   잠금해제(1) |   잠금(2)  |");
        System.out.println("|==========================|");
        System.out.println("|  시동켜기(3)  | 시동끄기(4) |");
        System.out.println("|==========================|");
        System.out.println("| 경적울리기(5) | 트렁크열기(6)|");
        System.out.println("|==========================|");
        System.out.println("|       자 동 주 차 (7)      |");
        System.out.println("|==========================|");
        System.out.println("|      앱 종 료 하 기 (0)    |");
        System.out.println("|==========================|");

        boolean offFlag = false;
        while(!offFlag) {
            System.out.println("입력하세요(1,2,3,4,5,6,7,0)");
            int command = scan.nextInt();

            switch(command) {
                case 1:
                    car.unLock();
                    break;
                case 2:
                    car.lock();
                    break;
                case 3:
                    car.startEngine();
                    break;
                case 4:
                    car.stopEngine();
                    break;
                case 5:
                    car.honk();
                    break;
                case 6:
                    car.openTrunk();
                    break;
                case 7:
                    car.autoParking();
                    break;
                case 0:
                    offFlag = true;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
        System.out.println(username+"의 "+carname+"리모컨 App 종료합니다.");
    }
}
