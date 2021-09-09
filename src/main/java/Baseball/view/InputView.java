package Baseball.view;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public int[] inputView() {
        int[] input_arr = new int[3];
        System.out.println("숫자를 입력해 주세요: ");
        String input_value = scanner.nextLine();
        for (int i = 0; i < input_value.length(); i++) {
            input_arr[i] = input_value.charAt(i) - '0';
        }
        return input_arr;
    }
}
