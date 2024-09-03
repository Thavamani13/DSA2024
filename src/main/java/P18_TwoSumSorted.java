import org.testng.annotations.Test;

public class P18_TwoSumSorted {

  //  https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

    @Test
    public void testcase1(){
        int[] nums = new int[]{2,7,11,15};
        int target=9;
        twoSum(nums,target);
    }

    private int[] twoSum(int[] nums, int target) {
        int left=0,right=nums.length-1;

        while(left<right){
            if(nums[left]+nums[right]==target){
                return new int[]{left+1,right+1};
            }

            if(nums[left]+nums[right]<target){
                left++;
            }
            else {
                right--;
            }

        }
        return nums;
    }


}
