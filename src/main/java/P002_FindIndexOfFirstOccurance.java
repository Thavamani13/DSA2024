import org.testng.Assert;
import org.testng.annotations.Test;

public class P002_FindIndexOfFirstOccurance {

    @Test
    public  void testcase1(){
        String haystack = "sadbutsad";
        String needle ="sad";
        findIndex(haystack,needle);
    }

    @Test
    public  void testcase2(){
        String haystack = "leetcode";
        String needle ="leeto";
        Assert.assertEquals(-1,findIndex(haystack,needle));
    }

    @Test
    public  void testcase3(){
        String haystack = "hello";
        String needle ="ll";
        Assert.assertEquals(2,findIndex(haystack,needle));
    }

    @Test
    public  void testcase4(){
        String haystack = "a";
        String needle ="a";
        Assert.assertEquals(0,findIndex(haystack,needle));
    }

    @Test
    public  void testcase5(){
        String haystack = "abc";
        String needle ="c";
        Assert.assertEquals(2,findIndex(haystack,needle));
    }

    /*Iterate through the given haystack string
    Find the substring of the given needle length
    Match it with the needle string
    if matches -> return the index
    if not return -1;

    Time - O( n)
    Space -O(n)

*/
    public int findIndex(String haystack, String needle) {

        if(haystack.length()==needle.length() && haystack.equalsIgnoreCase(needle)){
            return 0;
        }

        if(haystack.length()==needle.length() && !haystack.equalsIgnoreCase(needle)){
            return -1;
        }

        for (int i = 0; i <i+needle.length(); i++) {
            String subsStr = haystack.substring(i,i+needle.length());
            if (subsStr.equalsIgnoreCase(needle)){
                return i;
            }
        }

        return  -1;
    }
}
