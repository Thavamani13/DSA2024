package array;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortZeroOneandTwos {

    @Test
    public void testccase1() {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortNumsOptimized(nums);
    }

    /* ass ing three pointer left , mid =0 , right = right extereme
     if mid points = 0 , swap  low and mid values  , increment low and mid pointer
     if mid points  = 1 ,  increment mid index
     if mid points =2 , swap  mid and high val , decrement high

*/
    private void sortNumsOptimized(int[] nums) {
        int low =0,mid=0, temp=0;
        int right = nums.length-1;

        while(mid<=right){

            if(nums[mid]==0){
                temp = nums[mid];
                nums[mid] =nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }

            else if(nums[mid]==1){
               mid ++;

            }
            else {
                temp = nums[mid];
                nums[mid] =nums[right];
                nums[right]=temp;
                right--;
            }

        }

        System.out.print(Arrays.toString(nums));

    }

    @Test
    public void testccase2() {
        int[] nums = new int[]{2,0,1};
        sortNums(nums);
    }

    private void sortNums(int[] nums) {
         int [] counts = new int[3];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==0) counts[0]++;
            if(nums[i]==1) counts[1]++;
            if(nums[i]==2) counts[2]++;

        }

        int[] outputArr = new int[nums.length];
        int index=0;

        for (int i = 0; i <counts.length ; i++) {
            int count = counts[i];
            while(count>0){
                outputArr[index]=i;
                count--;
                index++;
            }
        }

        System.out.print(Arrays.toString(outputArr));


    }
}
