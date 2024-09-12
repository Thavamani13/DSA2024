import org.testng.Assert;
import org.testng.annotations.Test;

public class P23_CountPrimes {

    @Test
    public  void testcase1(){
        int x =10;
        Assert.assertEquals(4,countPrimes( x));
    }

    @Test
    public  void testcase2(){
        int x =0;
        Assert.assertEquals(0,countPrimes( x));
    }

    @Test
    public  void testcase3(){
        int x =1;
        Assert.assertEquals(0,countPrimes( x));
    }

    private int countPrimes(int x) {
       if(x<2) return 0;

       int count=0;
        for (int i =2; i <x ; i++) {
            if(i%2!=0){
                count++;
            }
        }

        return count+1;
    }


}
