import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class P21_CountDigits {

    @Test
    public void testcase1() {
        int num = 7;
        Assert.assertEquals(1,countDigits(num));

    }

    @Test
    public void testcase2() {
        int num = 121;
        Assert.assertEquals(2,countDigits(num));

    }

    @Test
    public void testcase3() {
        int num = 1248;
        Assert.assertEquals(4,countDigits(num));

    }

    /*Get all unique digits from the given num
    See the number can be divided by that digit if yes increase the count
*/
    private int countDigits(int num) {

        int givenNum=num;
        int count=0;
        while(num>0){
            int digit = num%10;
            if(givenNum%digit==0) count++;
            num=num/10;
        }

       return count;
    }
}