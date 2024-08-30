import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class P005_ReverseString {

    //https://leetcode.com/problems/reverse-string/description/

    @Test
    public  void testcase1(){
        char[] nums = new char[]{'h','e','l','l','o'};
        reverseString(nums);
    }

    private void reverseString(char[] nums) {
        int left=0,right=nums.length-1;

        while(left<=right){
            char temp =nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;

        }
        System.out.print(Arrays.toString(nums));
    }
}
