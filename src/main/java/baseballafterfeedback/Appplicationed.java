package baseballafterfeedback;
// In Java, Package = Directory

//OOP
// 1. 기능을 가지고 있는 클래스를 인스턴스화 (=객체)한다.
// 2. 필요한 기능(역할에 맞는)을 각 인스턴스가 수행하게 한다. (의인화)
// 3. 각 결과를 합친다. (합쳐서 하나의 프로그램을 만든다)

// 기능 목록
// - [x] 1부터 9까지의 서로 다른 임의의 수 3개를 생성한다. - NumberGenerator#createRandomNumber()
// - [x] 컴퓨터의 수 (3자리)와 플레이어의 수 (3자리)를 비교할 수 있다. - Referee#compare()
//      - [x] 몇 개의 숫자가 같은지를 알 수 있다. - Judgement#correctCount()
//      - [x] 특정 자리에 특정 숫자가 있는 지 알 수 있다. - Judgement#hasPlace()
// - [x] 같은 수가 다른 자리에 있으면 볼이다. -
// - [x] 같은 수가 같은 자리에 있으면 스트라이크다
// - [x] 같은 수가 전혀 없으면 낫싱이다.

import baseballafterfeedback.domain.Judgement;
import baseballafterfeedback.domain.NumberGenerator;
import baseballafterfeedback.domain.Referee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Appplicationed {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> computer = numberGenerator.createRandomNumbers();
        Referee referee = new Referee();

        String result = "";
        while (!result.equals("0볼 3스트라이크")) {
            result = referee.compare(computer, askNumbers());
            System.out.println(result);
            System.out.println(computer);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static List<Integer> askNumbers() {
        System.out.print("숫자를 입력해 주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}
