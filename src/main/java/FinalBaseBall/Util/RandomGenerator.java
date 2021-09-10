package FinalBaseBall.Util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomGenerator {


    public List<Integer> ComputerNumberGenerator(){
        List<Integer> computer =new ArrayList<Integer>();
        Random random = new Random();
        while(computer.size() < 3){
                int cNumber = (random.nextInt(8) + 1);
                if (computer.contains(cNumber)){
                    continue;
                }
                computer.add(cNumber);
        }
        return computer;
    }
}
