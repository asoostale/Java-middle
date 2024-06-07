package exceiption.ex5;

import exceiption.ex4.NetworkServiceV4;
import exceiption.ex4.SendExceptionV4;

import java.util.Scanner;

public class MainV5 {
    public static void main(String[] args) {
        NetworkServiceV5 networkService = new NetworkServiceV5();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {

            }
            System.out.println("프로그램을 정상 종료합니다.");
        }
    }
    //공통 예외 처리
    private static void exceptionHandler(Exception e) {
        //공통 처리
        System.out.println("사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생하였습니다.");
        System.out.println("==개발자용 디버깅 메세지==");
        e.printStackTrace(System.out); //스택 트레이스 출력
        //필요하면 예외 별로 별도의 추가 처리 기능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData() );
        }
    }
}
