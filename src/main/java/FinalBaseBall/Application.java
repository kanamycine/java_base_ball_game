package FinalBaseBall;
/*
* 요구사항
* 1. Util - RandomGenerator (랜덤 숫자 3개 생성)
*         - 출력
*         - 다시 진행, 종료 선택
*
* 2. Domain - Judge ( 스트라이크 볼 판단)
*               - Strike 판단
*               - 볼 판단
*               - 낫싱 판단
* 3. Application
*
단 */


import FinalBaseBall.Util.RandomGenerator;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
        RandomGenerator randomGenerator = new RandomGenerator();
        List<Integer>  s = randomGenerator.ComputerNumberGenerator();
            System.out.println(s);
            i++;
        }
    }
}
