package DiagonalDifference;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalA = 0;
        int diagonalB = 0;
        int inc = 0;
        for (List<Integer> row: arr
             ) {
            int len= arr.size();
            diagonalA+=row.get(inc);
            diagonalB+=row.get(len-1-inc++);

        }
        // Write your code here
        return Math.abs(diagonalA-diagonalB);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {


        int n = 5;

        List<List<Integer>> arr = new ArrayList<>();
    List <Integer> tLIst = new ArrayList<>();
    tLIst.add(11);
    tLIst.add(2);
    tLIst.add(4);
    arr.add(tLIst);
        System.out.println(arr);

        tLIst = new ArrayList<>();
        tLIst.add(4);
        tLIst.add(5);
        tLIst.add(6);
        arr.add(tLIst);

        System.out.println(arr);

        tLIst = new ArrayList<>();
        tLIst.add(10);
        tLIst.add(8);
        tLIst.add(-12);

        arr.add(tLIst);

        int result = Result.diagonalDifference(arr);

        System.out.println(result);
    }
}
