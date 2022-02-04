package TimeConversion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int time = 0;
        String[] arrayTime = s.split(":");
        String result = "";
        result=s.substring(0,s.length()-2);

        time = Integer.parseInt(arrayTime[0]);
        if (s.contains("AM")) {
            System.out.println("AM");
            if (time==12) {
                return "00:"+arrayTime[1]+":"+arrayTime[2].substring(0,2);
            } else {return arrayTime[0]+":"+arrayTime[1]+":"+arrayTime[2].substring(0,2);

            }


        }
        if (time==12) {return arrayTime[0]+":"+arrayTime[1]+":"+arrayTime[2].substring(0,2);

        }
        time+=12;
        return String.valueOf(time)+":"+arrayTime[1]+":"+arrayTime[2].substring(0,2);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        String s = "12:45:54PM";

        String result = Result.timeConversion(s);
        System.out.println(result);

    }
}
