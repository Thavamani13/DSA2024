import org.testng.Assert;
import org.testng.annotations.Test;

public class P003_LengthOfLastWord {

    //https://leetcode.com/problems/length-of-last-word/description/

    @Test
    public  void testcase1(){
        String s = "Hello World";
        Assert.assertEquals(5,findLengthOfLastWord(s));
    }

    /*split by  space
    * get the last element of string array
    * if the  last string does not has space return the size
    * if it contains space move to other immediate left string
    * Time  - O(n)
    * Space - O(n)  */

    private int findLengthOfLastWord(String s) {
       String[] stringArr= s.split(" ");

        for (int i = stringArr.length-1; i >=0 ; i--) {
            String str =stringArr[i];
            if (!str.contains(" ")) return str.length();
        }
        return -1;
    }




}
