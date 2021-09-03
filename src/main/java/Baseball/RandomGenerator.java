package Baseball;
import java.util.*;

public class RandomGenerator {

    public int[] makeRandomNumber(){

        Random random = new Random();
        int[] arr = new int[3];

        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        return arr;
    }
}
