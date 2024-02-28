package mappractice;

import java.util.HashMap;
import java.util.Scanner;

public class LogInPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> information = new HashMap<>();

        System.out.println("회원가입 할 ID를 입력하세요: ");
        String ID = scan.nextLine();
        System.out.println("화원가입 할 Password를 입력하세요: ");
        String Password = scan.nextLine();

        information.put(ID, Password);
        System.out.println("저장되었습니다.\n");
        while(true) {
            System.out.println("로그인 할 ID를 입력하세요: ");
            String inputID = scan.nextLine();
            if (information.containsKey(inputID)) {
                while(true) {
                System.out.println("로그인 할 Password를 입력하세요: ");
                String inputPassword = scan.nextLine();
                    if (information.get(inputID).equals(inputPassword)) {
                        System.out.println("로그인 성공!"); break;
                    }
                    else {
                        System.out.println("비밀번호가 틀렸습니다.");
                    }
                } break;
            } else {
                System.out.println("아이디가 존재하지 않습니다.");
            }
        }
    }
}
