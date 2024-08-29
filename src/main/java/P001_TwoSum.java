import org.testng.Assert;
import org.testng.annotations.Test;

public class P001_TwoSum {

    //    https://leetcode.com/problems/two-sum/

    @Test()
    public void testcase1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Assert.assertEquals(twoSum(nums,target),new int[]{0,1});



    }


    private int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            int leftVal = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int rightVal = nums[j];
                if (leftVal + rightVal == target) return new int[]{i, j};


            }
        }

        return new int[]{-1, -1};
    }


}
