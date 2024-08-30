import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class P10_ContainsDuplicate {

    @Test
    public  void testcase1(){
        int[] nums = new int[]{1,2,3,1};
        Assert.assertEquals(true,isDuplicate(nums));
    }

    private boolean isDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.size()!=0 && map.get(nums[i])==2){
                return true;
            }
        }

        return false;
    }
}
