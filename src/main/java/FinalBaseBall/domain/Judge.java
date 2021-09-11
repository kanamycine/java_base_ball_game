package FinalBaseBall.domain;

import java.util.ArrayList;
import java.util.List;

public class Judge {
    public static List<Integer> judge(List<Integer> computer, String user) {

        List<Integer> count = new ArrayList<Integer>();
        int strikeCount = 0;
        JudgeBall judgeBall = new JudgeBall();
        JudgeStrike judgeStrike = new JudgeStrike();

        strikeCount = judgeStrike.judgeStrikeCount(computer, user);
        int ballCount = judgeBall.judgeBallCount(computer, user, strikeCount);

        count.add(ballCount);
        count.add(strikeCount);

        return count;
    }
}
