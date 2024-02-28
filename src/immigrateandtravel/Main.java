package immigrateandtravel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nation korea = new Nation("Korea", "Asia", 3, 800, "Japan");
        Nation japan = new Nation("Japan", "Asia", 3, 750, "USA");
        Nation usa = new Nation("USA", "America", 3, 900, "Asia");

//        Citizen[] koreaCitizens = {
//                new Citizen("손흥민", 30, 1000, "Asia", "Korea"),
//                new Citizen("이승엽", 45, 800, "Asia", "Korea"),
//                new Citizen("이정후", 23, 500, "Asia", "Korea")
//        };
        korea.citizens.add(new Citizen("손흥민", 30, 1000, "Asia", "Korea"));
        korea.citizens.add(new Citizen("이승엽", 45, 800, "Asia", "Korea"));
        korea.citizens.add(new Citizen("이정후", 23, 500, "Asia", "Korea"));

//        Citizen[] japanCitizens = {
//                new Citizen("Akiko", 19, 300, "Asia", "Japan"),
//                new Citizen("Naruto", 32, 1200, "Asia", "Japan"),
//                new Citizen("KoNan", 8, 120, "Asia", "Japan")
//        };
        japan.citizens.add(new Citizen("Akiko", 19, 300, "Asia", "Japan"));
        japan.citizens.add(new Citizen("Naruto", 32, 1200, "Asia", "Japan"));
        japan.citizens.add(new Citizen("KoNan", 8, 120, "Asia", "Japan"));

//        Citizen[] usaCitizens = {
//                new Citizen("Trump", 66, 2000, "Amrica","USA"),
//                new Citizen("Obama", 58, 700, "America","USA"),
//                new Citizen("David", 30, 1000, "America","USA")
//        };
        usa.citizens.add(new Citizen("Trump", 66, 2000, "Amrica","USA"));
        usa.citizens.add(new Citizen("Obama", 58, 700, "America","USA"));
        usa.citizens.add(new Citizen("David", 30, 1000, "America","USA"));

        // 일본인의 한국으로의 망명신청
        for (int i=0; i<japan.citizens.size(); i++) {
            boolean asylumApproved = korea.checkAsylumRequest(japan.citizens.get(i));
            System.out.println(japan.citizens.get(i).name + "님의 " + korea.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
        }
        // 미국인의 한국망명  => 향상된  for 문으로 변경
//        for (int i=0; i<usa.citizens.size(); i++) {
//            boolean asylumApproved = korea.checkAsylumRequest(usa.citizens.get(i));
//            System.out.println(usa.citizens.get(i).name + "님의 " + korea.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
//        }
        for (Citizen citizen : usa.citizens) {
            boolean asylumApproved = korea.checkAsylumRequest(citizen);
            System.out.println(citizen.name + "님의 " + korea.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
        }
        // 한국인의 일본으로의 망명신청  => 객체의 멤버 배열
        for (int i=0; i<korea.citizens.size(); i++) {
            boolean asylumApproved = japan.checkAsylumRequest(korea.citizens.get(i));
            System.out.println(korea.citizens.get(i).name + "님의 " + japan.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
        }
        // 미국인의 일본망명 => 스트림으로 변경해서 처리
//        for (int i=0; i<usa.citizens.size(); i++) {
//            boolean asylumApproved = japan.checkAsylumRequest(usa.citizens.get(i));
//            System.out.println(usa.citizens.get(i).name + "님의 " + japan.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
//        }
        usa.citizens.stream()
                .forEach(citizen -> {
                    boolean asylumApproved = japan.checkAsylumRequest(citizen);
                    System.out.println(citizen.name + "님의 " + japan.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
                });

        // 아래는 collection 으로 멤버 타입 변경 후 데이터 핸들링 반영
        // 한국인의 미국으로의 망명신청
        for (int i=0; i<korea.citizens.size(); i++) {
            boolean asylumApproved = usa.checkAsylumRequest(korea.citizens.get(i));
            System.out.println(korea.citizens.get(i).name + "님의 " + usa.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
        }
        // 일본인의 미국으로의 망명신청
        for (int i=0; i<japan.citizens.size(); i++) {
            boolean asylumApproved = usa.checkAsylumRequest(japan.citizens.get(i));
            System.out.println(japan.citizens.get(i).name + "님의 " + usa.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
        }


        //


        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n망명신청을 시작합니다.\n망명을 원하는 국가를 말씀하세요. (Korea, Japan, USA)");
        String nation = scan.nextLine();
        System.out.println("성함을 입력해주세요.");
        String name = scan.nextLine();
        System.out.println("연령을 입력해주세요.");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("보유자산의 금액을 입력하세요.");
        int money = scan.nextInt();
        scan.nextLine();
        System.out.println("거주 대륙을 입력하세요. (Asia, America)");
        String region = scan.nextLine();
        System.out.println("거주 국가를 입력하세요. (Korea, Japan, USA)");
        String country = scan.nextLine();

        Citizen inputCitizen = new Citizen(name, age, money, region, country);
        if (nation.equals("Korea")) {
            boolean asylumApproved = korea.checkAsylumRequest(inputCitizen);
            System.out.println(inputCitizen.name + "님의 " + korea.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
        } else if (nation.equals("Japan")) {
            boolean asylumApproved = japan.checkAsylumRequest(inputCitizen);
            System.out.println(inputCitizen.name + "님의 " + japan.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
        } else if (nation.equals("USA")) {
            boolean asylumApproved = usa.checkAsylumRequest(inputCitizen);
            System.out.println(inputCitizen.name + "님의 " + usa.countryName + "으로의 망명신청: " + (asylumApproved ? "통과" : "불통과"));
        } else {
            System.out.println("신청 국가를 잘못 입력하셨습니다.");
        }
    }
}
