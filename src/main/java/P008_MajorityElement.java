import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class P008_MajorityElement {

    @Test
    public void testcase1(){
        int[]  nums = new int[] {3,2,3};
        majorityElement(nums);
    }

    private int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>nums.length/2) return nums[i];
        }
        return 0;
    }
}
