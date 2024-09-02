import org.testng.Assert;
import org.testng.annotations.Test;

public class P14_Issubsequence {

    @Test
    public  void testcase1(){
        String s = "abc";
        String t= "ahbgdc";
        isSubsequence(s,t);
    }


    @Test
    public  void testcase2(){
        String s = "axc";
        String t= "ahbgdc";
        Assert.assertEquals(true,isSubsequence(s,t));
    }




    private boolean isSubsequence(String s, String t) {
        int left=0, right=0;

        while(left<s.length()&&right<t.length()){
            char leftChar = s.charAt(left);
            char rightChar = t.charAt(right);
            if(leftChar==rightChar){
                left++;
                right++;
            }
            else right++;

        }

        return left==s.length();
    }
}
