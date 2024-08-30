import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class P007_FirstLetterToAppearTwice {

    @Test
    public void testcase1(){
        String s ="abccbaacz";
        Assert.assertEquals('c',repeatedCharacter(s));
    }

    @Test
    public void testcase2(){
        String s ="abcdd";
        Assert.assertEquals('d',repeatedCharacter(s));
    }



    public char repeatedCharacter(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char inputChar = s.charAt(i);

            if(map.containsKey(inputChar)){
                System.out.print(inputChar);
                return inputChar;
            }
            else {
                map.put(inputChar,map.getOrDefault(inputChar,0)+1);
            }
        }
        return 0;
    }
}
