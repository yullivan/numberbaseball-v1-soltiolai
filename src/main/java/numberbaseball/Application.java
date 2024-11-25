package numberbaseball;

import java.util.Scanner;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int answer1 = random.nextInt(9) + 1;
        int answer2 = random.nextInt(9) + 1;
        while (answer1==answer2) {
            answer2 = random.nextInt(9) + 1;
        }
        int answer3 = random.nextInt(9) + 1;
        while (answer1==answer3 || answer2==answer3) {
            answer3 = random.nextInt(9) + 1;
        }

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        int strike=0;
        boolean isCorrect=false;
        while (isCorrect==false) {
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int user1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int user2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int user3 = scanner.nextInt();

            // TODO: strike 개수를 계산하세요
            if(user1==answer1){
                strike++;
            }
            if(user2==answer2){
                strike++;
            }
            if(user3==answer3){
                strike++;
            }

            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
            System.out.println(strike+" 스트라이크");

            // TODO: 3 스트라이크인 경우 게임을 끝내세요
            if(strike==3){
                isCorrect=true;
            } else {
                strike=0;
            }

        }

        System.out.println("축하합니다! 정답을 맞히셨습니다.");
    }

}
