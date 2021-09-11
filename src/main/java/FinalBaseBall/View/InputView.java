package FinalBaseBall.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public String input(){
        System.out.println("숫자를 입력해 주세요: ");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();

        return user;
    }
}
