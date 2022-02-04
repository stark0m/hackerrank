package Staircase;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        int flag = n -1;
        while (flag>=0) {
            for (int i = 0; i < flag; i++) {
                System.out.print(" ");;
                            }
            for (int i = flag; i <n ; i++) {
                System.out.print("#");
            }
            System.out.println("");

            flag--;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {


        int n = 6;

        Result.staircase(n);


    }
}
