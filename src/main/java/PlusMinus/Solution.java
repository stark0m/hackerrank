package PlusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float f = 0;
        int countPositiveNumbers = 0;
        int countNegativeNumbers = 0;
        int countZeroNumbers = 0;
        for (int currentNumber: arr) {
            if (currentNumber>0) {
                countPositiveNumbers++;
            } else if (currentNumber<0) {
                countNegativeNumbers++;
            } else countZeroNumbers++;
        }
        f= (float) countPositiveNumbers / arr.size();
        System.out.printf("%.6f%n",f);
        f= (float) countNegativeNumbers / arr.size();
        System.out.printf("%.6f%n",f);
        f= (float) countZeroNumbers/ arr.size();
        System.out.printf("%.6f%n",f);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {


        List<Integer> arr = new ArrayList<>();


        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);


        Result.plusMinus(arr);


    }
}
