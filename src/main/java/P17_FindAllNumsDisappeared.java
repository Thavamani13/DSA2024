import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class P17_FindAllNumsDisappeared {

    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

    @Test
    public  void testcase1(){
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);
    }

    @Test
    public  void testcase2(){
        int[] nums = new int[]{1,1};
        findDisappearedNumbers(nums);
    }

    private void findDisappearedNumbers(int[] nums) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 1; i <=nums.length ; i++) {
            arrList.add(i);
        }

        System.out.print(arrList.toString());

        for (int i = 0; i <nums.length ; i++) {
            int inputVal = nums[i];
            if(arrList.contains(inputVal)){
                arrList.remove(arrList.indexOf(inputVal));
            }
        }

        System.out.print(arrList.toString());
    }
}
