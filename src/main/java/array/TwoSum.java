package array;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    @Test
    public void testccase1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        findTwoSum(nums, target);
    }

    @Test
    public void testccase2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 9;
        findTwoSum(nums, target);
    }

    @Test
    public void testccase3() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        findTwoSumOptimized(nums, target);
    }


    private int[] findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};

            }
        }
        return new int[]{-1, -1};
    }

    private int[] findTwoSumOptimized(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int difference = target-nums[i];

            if(!map.containsKey(difference)){
                map.put(nums[i],i);
            }

            else{
                return new int[]{map.get(difference),i};
            }



        }



        return new int[]{-1,-1};
    }
}



