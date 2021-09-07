package Baseball.view;
import java.util.Scanner;


public class OutputView {
    int strikeCount = 0;
    int ballCount = 0;
    int flagInput = 0;

    Scanner scanner = new Scanner(System.in);

    public OutputView(int strikeCount, int ballCount){
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public int outputView(){
        if(strikeCount == 3){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임을 종료합니다.");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int flagInput = scanner.nextInt();
            return flagInput;
        }
        if(strikeCount == 0 && ballCount == 0){
            System.out.println("낫싱");
            }
        if(strikeCount != 0 && ballCount == 0){
            System.out.println(strikeCount + "스트라이크");
        }
        if(strikeCount == 0 && ballCount != 0){
            System.out.println(ballCount + "볼");
            }
        if(strikeCount != 0 && ballCount != 0){
            System.out.println(ballCount + "볼" + " " + strikeCount + "스트라이크");
            }

        return 0 ;
    }
}
