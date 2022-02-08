package codewars.FindTheOddInt;

import java.util.ArrayList;
import java.util.List;

public class FindOddTest {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{0, 1, 0, 1, 0}));
        ;
        //        assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
//        assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
//        assertEquals(10, FindOdd.findIt(new int[]{10}));
//        assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
//        assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

    public static class ResultClass {
        int value;
        int count;

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

        public ResultClass(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }

    public static int findIt(int[] a) {
        List<ResultClass> resultArray = new ArrayList<>();
        int resultMin = 0;
        int resultValue = 0;
        int counter = 0;
        boolean isNewElement = false;

        for (int i = 0; i < a.length; i++) {

            isNewElement = true;
            for (ResultClass aa : resultArray
            ) {
                if (aa.toString().equals(String.valueOf(a[i]))) {
                    aa.count++;
                    isNewElement = false;
                }

            }
            if (isNewElement) {
                resultArray.add(new ResultClass(a[i], 1));
//                System.out.println(a[i]);
            }


        }


        if (resultArray.size() == 1) {
            return resultArray.get(0).value;
        }
        for (ResultClass aa : resultArray) {
            if (aa.count % 2 == 1) {
                return aa.value;
            }
        }


        return 0;

    }


}


