package Baseball.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Judge {
    int [] input_arr = new int[3];
    int [] arr = new int [3];

    public Judge(int [] input_arr, int [] arr){
        this.input_arr = input_arr;
        this.arr = arr;
    }

    int ballCount = 0;
    int strikeCount = 0;
    boolean isNothing = false;

    public int isStrike(){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == input_arr[i]){
                    strikeCount += 1;
            }
        }
        return strikeCount;
    }
    public int isBall(){
        List<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length; i++){
            arrList.add(arr[i]);
        }

        for(int i = 0; i< input_arr.length; i++){
            if(arrList.contains(input_arr[i]) && arrList.get(i) != input_arr[i]){
                ballCount += 1;
            }
        }

        return ballCount;
    }
}
