import org.testng.Assert;
import org.testng.annotations.Test;

public class P22_ReverseInteger {

    @Test
    public  void testcase1(){
        int x =123;
        Assert.assertEquals(321,reverseInt( x));
    }

    @Test
    public  void testcase2(){
        int x =-123;
        Assert.assertEquals(-321,reverseInt( x));
    }

    @Test
    public  void testcase3(){
        int x =120;
        Assert.assertEquals(21,reverseInt( x));
    }

  /*  Convert int to string , reverse string and convert back to int

    */

    private int reverseInt(int x) {

        int reverse =0 ;

        while(x!=0){
            int digit =x%10;
            reverse= reverse*10+digit;
            x=x/10;
        }
        System.out.print(reverse);
       return  reverse;
    }
}
