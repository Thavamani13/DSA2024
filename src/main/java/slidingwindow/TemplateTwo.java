package slidingwindow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TemplateTwo {

    /*Smallest subArray which give the SUMVALUE>=TARGET
    *  Window size is undefined*/

    @Test
    public void testcase1() {
        int[] intarr = { 4, 2, 2, 7, 8, 1, 2, 8, 10 };
        int target = 8;

        Assert.assertEquals(1, findSmallestSubArray(intarr, target));
    }

    private int findSmallestSubArray(int[] intarr, int target) {

        int windowSum =0;
        int windowStart=0;
        int minLength =Integer.MAX_VALUE;

        for (int windowEnd = 0; windowEnd <intarr.length ; windowEnd++) {
            windowSum+=intarr[windowEnd];

            while(windowSum>=target){
                minLength =Math.min(minLength,((windowEnd-windowStart)+1));
                windowSum-=intarr[windowStart];
                windowStart++;
            }
        }


        return minLength;
    }
}
