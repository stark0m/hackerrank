package CompareThisTriplets;


import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    public static @NotNull List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int a1 = 0;
        int b1 = 0;
        int alice =0;
        int bob = 0;
        for (int i = 0; i < 3; i++) {
            alice=a.get(i);
            bob=b.get(i);
            if (alice > bob) {
                a1++;
            } else if (alice < bob) {
                b1++;
            }


        }
        result.add(a1);
        result.add(b1);
        return result;
    }
}


    public class Solution {
        public static void main(String[] args) throws IOException {



            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            a.add(17);
            a.add(28);
            a.add(30);
            b.add(99);
            b.add(16);
            b.add(8);

            List<Integer> result = Result.compareTriplets(a, b);

            System.out.println(result);





        }
    }
