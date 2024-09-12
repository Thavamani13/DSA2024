import org.testng.Assert;
import org.testng.annotations.Test;

public class P24_CheckPalindrome {

    @Test
    public  void testcase1(){
        int x =121;
        Assert.assertEquals(true,isPalindrome( x));
    }

    @Test
    public  void testcase2(){
        int x =-121;
        Assert.assertEquals(false,isPalindrome( x));
    }

    @Test
    public  void testcase3(){
        int x =10;
        Assert.assertEquals(false,isPalindrome( x));
    }


    private boolean isPalindrome(int x) {
        if(x<0) return  false;
        if(x<10)return true;
        int givenNum=x;

        int reverse =0 ;

        while(x!=0){
            int digit =x%10;
            reverse= reverse*10+digit;
            x=x/10;
        }
        System.out.print(reverse);
        return  reverse==givenNum?true:false;
    }



}
