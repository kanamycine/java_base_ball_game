package Baseball;
import java.util.*;

public class RandomGenerator {
    int[] arr = new int[3];
    public int[] makeRandomNumber(){

        Random random = new Random();

        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = random.nextInt(8) + 1;
        }

        return arr;
    }
}
