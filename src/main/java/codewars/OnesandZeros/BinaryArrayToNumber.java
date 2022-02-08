package codewars.OnesandZeros;

import java.util.List;
import java.util.stream.Collectors;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String listString = binary.stream().map(Object::toString)
                .collect(Collectors.joining(""));
        // Your Code

        return Integer.parseInt(listString,2);
    }
}
