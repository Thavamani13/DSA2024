import java.util.HashMap;
import java.util.Map;

public class P006_FirstUniqueChar {

    public void testcase1(){
        String s ="leetcode";
        firstUniqChar(s);
    }

    private int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char inputChar =s.charAt(i);
            map.put(inputChar,map.getOrDefault(inputChar,0)+1);
        }

        for (int i = 0; i <s.length() ; i++) {
            char inputChar =s.charAt(i);
            if (map.get(inputChar)==1)return i;
        }
        return -1;
    }
}
