package FinalBaseBall.View;

import java.util.List;

public class OutputView {
    public void outputView(List<Integer> count){

        if (count.get(0) == 0 && count.get(1) == 0){
            System.out.println("낫싱");
            return;
        }
        if (count.get(0) == 0){
            System.out.println(count.get(1) + "스트라이크");
            return;
        }
        if (count.get(1) == 0){
            System.out.println(count.get(0) + "볼");
            return;
        }
        if (count.get(0) != 0) {
            System.out.println(count.get(0) + "볼 " + count.get(1) + "스트라이크");
        }
    };
}
