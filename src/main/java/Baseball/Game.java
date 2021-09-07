package Baseball;

import Baseball.domain.Judge;
import Baseball.view.InputView;
import Baseball.view.OutputView;

public class Game {
    public static void main(String[] args){
        int flag = 0;

        RandomGenerator randomGenerator = new RandomGenerator();
        InputView inputView = new InputView();
        int [] arr = randomGenerator.makeRandomNumber();

        while(flag == 0) {
            int[] input_arr = inputView.inputView();
            Judge judge = new Judge(input_arr, arr);
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            int strikeCount = judge.isStrike();
            int ballCount = judge.isBall();
            OutputView outputView = new OutputView(strikeCount, ballCount);
            flag = outputView.outputView();
        }
        while(flag == 1){
            arr = randomGenerator.makeRandomNumber();
            int[] input_arr = inputView.inputView();
            Judge judge = new Judge(input_arr, arr);
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            int strikeCount = judge.isStrike();
            int ballCount = judge.isBall();
            OutputView outputView = new OutputView(strikeCount, ballCount);
            flag = outputView.outputView();
        }
    }
}
