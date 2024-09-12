package slidingwindow;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TemplateThree {

    @Test
    public void testcase1() {
        String str="AAAHHIBC";
        int k=2;
        findLongestSubString(str,k);
    }

    /*Find Longest subsring with K distinct characters */


    /*Loop through the given array and add elemensts to it
      if the map size goes beyond the Target K
            - Reduce the occurance of the left character
            - if the occurance of left character is 0 --> remove the character
            - Increment the left pointer
       Track the maximum and return
     */
    private int findLongestSubString(String str, int k) {
        Map<Character,Integer> map = new HashMap<>();

        int windowStart=0 ;
        int maxLength=Integer.MIN_VALUE;
        for (int windowEnd = 0; windowEnd <str.length() ; windowEnd++) {
            Character inputChar = str.charAt(windowEnd);
            map.put(inputChar,map.getOrDefault(inputChar,0)+1);

            while (map.size()>k){
                //Reduce the occurance of left character , if it becomes zero remove the element
                Character leftChar = str.charAt(windowStart);
                map.put(leftChar,map.getOrDefault(leftChar,0)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }

                windowStart++;
            }

            maxLength=Math.max(maxLength,(windowEnd-windowStart)+1);
        }

        return maxLength;
    }

}
