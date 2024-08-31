import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class P12_ValidAnagram {

    //https://leetcode.com/problems/valid-anagram/description/

    @Test
    public  void testcase1(){
        String s = "anagram";
        String t= "nagaram";
        Assert.assertEquals(true,isValidAnagram(s,t));
    }

    private boolean isValidAnagram(String s, String t) {
        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char sChar = s.charAt(i);
            smap.put(sChar, smap.getOrDefault(sChar,0)+1);
        }

        for (int i = 0; i <t.length() ; i++) {
            char tChar = t.charAt(i);
            tmap.put(tChar, tmap.getOrDefault(tChar,0)+1);
        }
        return smap.equals(tmap);
    }


}
