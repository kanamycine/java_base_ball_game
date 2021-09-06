package Baseball.view;

import Baseball.domain.Judge;

public class OutputView {
    int strikeCount = 0;
    int ballCount = 0;
    Judge judge = new Judge();

    public OutputView(int strikeCount, int ballCount){
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public void outputView(){
        if(strikeCount == 3){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임을 종료합니다.");
            return;
        }else if(strikeCount != 3){
            judge.isBall();

        }

    }
}
