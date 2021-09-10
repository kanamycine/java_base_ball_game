package FinalBaseBall.domain;

import java.util.List;

public class JudgeStrike {
    public int judgeStrikeCount(List<Integer> computer, String user){
        int strikeCount = 0;
        for(int i = 0 ; i < computer.size(); i++){
            if (computer.get(i) == user.charAt(i)-'0'){
                strikeCount += 1;
            }
        }
        return strikeCount;
    }
}
