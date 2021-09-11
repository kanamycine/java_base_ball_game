package FinalBaseBall.View;

import java.util.List;
import java.util.Scanner;

public class OutputView {

    public int outputView(List<Integer> count){

        if (count.get(0) == 0 && count.get(1) == 3){
            System.out.println("맞췄어. 다시하려면 1 종료하려면 2 :");
            Scanner scanner = new Scanner(System.in);
            int choiceNumber = scanner.nextInt();
            return choiceNumber;
        }
        if (count.get(0) == 0 && count.get(1) == 0){
            System.out.println("낫싱");
            return 0;
        }
        if (count.get(0) == 0){
            System.out.println(count.get(1) + "스트라이크");
            return 0;
        }
        if (count.get(1) == 0){
            System.out.println(count.get(0) + "볼");
            return 0;
        }
        if (count.get(0) != 0) {
            System.out.println(count.get(0) + "볼 " + count.get(1) + "스트라이크");
            return 0;
        }
    return 0;}
}
