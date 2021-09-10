package FinalBaseBall;
/*
* 요구사항
* 1. [x] Util - RandomGenerator (랜덤 숫자 3개 생성)
*        [ ]    - 다시 진행, 종료 선택
*
* 2. [ ] Domain - Judge ( 스트라이크 볼 판단)
*        []    - Strike 판단
*        []    - 볼 판단
*        []    - 낫싱 판단
*
* 3. [x] View - 입력
*        [x]   출력
*
* 4. [x] Application - 종합한다
단 */


import FinalBaseBall.Util.RandomGenerator;
import FinalBaseBall.View.InputView;
import FinalBaseBall.View.OutputView;
import FinalBaseBall.domain.Judge;


import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 난수 생성 및, 사용자 입력 받기
        RandomGenerator randomGenerator = new RandomGenerator();
        InputView inputView = new InputView();

        String user = inputView.input();
        List<Integer>  computer = randomGenerator.computerNumberGenerator();
        System.out.println(computer);

        // 스트라이크, 볼 , 낫싱 판단
        Judge judge = new Judge();
        List<Integer> count = judge.judge(computer, user);


        // 출력, loop 질문
        OutputView outputView = new OutputView();
        outputView.outputView(count);
        }
    }

