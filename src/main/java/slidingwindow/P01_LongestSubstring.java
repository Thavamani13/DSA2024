package slidingwindow;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class P01_LongestSubstring {

    //

    @Test
    public void testcase1() {
        String str="abcabcbb";
        findLongestSubString(str);
    }


    /* longest
substring
 without repeating characters.

  Define a map
  define a left pointer
  Traverse the string and add the input character / its occurance to map
  if the map size becomes more than 1
       - Track The maximum length
       - Drop the left most character after decrement the count by 1
*/
    private int findLongestSubString(String str) {
        int windowStart = 0;
        int longestSubstr=Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            Character inputChar = str.charAt(windowEnd);
            map.put(inputChar, map.getOrDefault(inputChar,0)+1);

            while(map.size() < (windowEnd - windowStart + 1)){
                Character leftChar = str.charAt(windowStart);
                map.put(leftChar, map.getOrDefault(leftChar,0)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                windowStart++;
            }

            longestSubstr=Math.max(longestSubstr,(windowEnd-windowStart)+1);
        }

        return longestSubstr==Integer.MIN_VALUE?0:longestSubstr;
    }
}
