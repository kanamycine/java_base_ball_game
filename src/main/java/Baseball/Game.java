package Baseball;

import Baseball.domain.Judge;
import Baseball.view.InputView;
import Baseball.view.OutputView;
import com.sun.org.apache.xml.internal.serializer.OutputPropertyUtils;
import sun.font.StrikeCache;

public class Game {
    public static void main(String[] args){
        RandomGenerator randomGenerator = new RandomGenerator();
        InputView inputView = new InputView();

        int [] arr = randomGenerator.makeRandomNumber();
        int [] input_arr = inputView.inputView();

        Judge judge = new Judge(input_arr ,arr);
        int strikeCount = judge.isStrike();
        int ballCount = judge.isBall();
        OutputView outputView = new OutputView(strikeCount, ballCount);
    }
}
