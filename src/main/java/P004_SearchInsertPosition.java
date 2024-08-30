import org.testng.Assert;
import org.testng.annotations.Test;

public class P004_SearchInsertPosition {

   // https://leetcode.com/problems/search-insert-position/description/
    @Test
    public  void testcase1(){
       int[] nums = new int[]{1,3,5,6};
       int target =5;
        Assert.assertEquals(2,searchInsert(nums,target));
    }

    @Test
    public  void testcase2(){
        int[] nums = new int[]{1,3,5,6};
        int target =2;
        Assert.assertEquals(1,searchInsert(nums,target));
    }

    @Test
    public  void testcase3(){
        int[] nums = new int[]{1,3,5,6};
        int target =7;
        Assert.assertEquals(4,searchInsert(nums,target));
    }

    private int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target) return i;
            if(nums[i]>target && i<nums.length) return i;
            if(nums[i]<target && i==nums.length-1) return nums.length;
        }

        return -1;
    }
}
