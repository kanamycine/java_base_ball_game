package Baseball;

import java.util.*;

public class RandomGenerator {
    int[] arr = new int[3];


    public int[] makeRandomNumber() {
        ArrayList<Integer> tmpList = new ArrayList<Integer>();
        Random random = new Random();
        while (tmpList.size() < 3) {
            int randomTmp = random.nextInt(8) + 1;
            if (!tmpList.contains(randomTmp)) {
                tmpList.add(randomTmp);
            }
        }
        System.out.println(tmpList);
        for (int i = 0; i < tmpList.size(); i++) {
            arr[i] = tmpList.get(i);
        }
        return arr;
    }
}
