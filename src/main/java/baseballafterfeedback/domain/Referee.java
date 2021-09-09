package baseballafterfeedback.domain;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {
        // 몇개의 숫자가 포함되어 있는지 알아 낸뒤
        // 스트라이크의 갯수를 구해서 뺀다
        // 남은 수는 볼의 개수
        Judgement judgement = new Judgement();
        int correctCount = judgement.correctCount(computer, player);

        int strike = 0;
        for (int placeIndex = 0; placeIndex < player.size(); placeIndex++) {
            if (judgement.hasPlace(computer, placeIndex, player.get(placeIndex))) {
                strike++;
            }
        }
        int ball = correctCount - strike;

        if (strike == 0 && ball == 0) {
            return "낫싱";
        }

        return ball + "볼 " + strike + "스트라이크";
    }
}
