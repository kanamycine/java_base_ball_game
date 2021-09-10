package FinalBaseBall.domain;

import java.util.List;

public class JudgeBall {
    public int judgeBallCount(List<Integer> computer, String user, int strikeCount){
        int ballCount = 0;
        for(int i = 0; i < computer.size(); i ++){
            if (computer.contains(user.charAt(i)-'0')){
                ballCount += 1;
            }
        }

        return ballCount - strikeCount;
    }
}
