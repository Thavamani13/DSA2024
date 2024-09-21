package array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortZeroOneandTwos {

    @Test
    public void testccase1() {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortNums(nums);
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
