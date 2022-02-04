package MiniMaxSum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
    long sum = 0;
    int max = arr.get(0);
    int min = arr.get(0);
    int temp;
        for (int i: arr
             ) {
            sum+=i;
            if (i>max) max=i;
            if (i<min) min=i;

        }
        System.out.printf("%d %d",sum-max, sum-min);
        System.out.println();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = new ArrayList<>();

        arr.add(140537896);
        arr.add(243908675);
        arr.add(670291834);
        arr.add(923018467);
        arr.add(520718469);

        Result.miniMaxSum(arr);


    }
}

