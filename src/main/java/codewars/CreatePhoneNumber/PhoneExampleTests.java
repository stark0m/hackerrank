package codewars.CreatePhoneNumber;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PhoneExampleTests {
    private static String PHONE_FORMAT = "(%d%d%d) %d%d%d-%d%d%d%d";
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }


    private static String createPhoneNumber(int[] ints) {
//        Integer[] numbersInt = Arrays.stream(ints).boxed().toArray(Integer[]::new);
//        return String.format(PHONE_FORMAT, numbersInt);
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", Arrays.stream(ints).boxed().toArray());
//        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(ints).boxed().toArray());
        //        String s = "("+ints[0]+ints[1]+ints[2]+") "+ints[3]+ints[4]+ints[5]+"-"+ints[6]+ints[7]+ints[8]+
//        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",ints[0],ints[1],ints[2],ints[3],ints[4],ints[5],ints[6],ints[7],ints[8],ints[9]);
//        return s;
    }
}
