package slidingwindow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TemplateOne {

    /*Find max sum subarray of a fixed size K*/

    @Test
    public void testcase1() {
        int[] intarr= {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int k =3;
        Assert.assertEquals(16, findMaxSubArray(intarr,k));
    }

    /*Define two variable to track the max sum and window current sum
      Loop through the given array
          - find the window sum till it reaches to the window length
          - once it rached , track the windowsum and current sum -> find max between these two
          - Drop the first eelement
    */

    private int findMaxSubArray(int[] intarr, int k) {

        int maxSum=Integer.MIN_VALUE;
        int windowSum=0;

        for(int i=0;i<intarr.length;i++){
            windowSum+=intarr[i];

            if(i>=k-1){
                maxSum=Math.max(maxSum,windowSum);
                windowSum=windowSum-intarr[i-(k-1)];
            }
        }

        return maxSum;
    }


}
