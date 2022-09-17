package Solutions.Problem242ValidAnagram.gopi;

import java.util.ArrayList;
import java.util.List;

public class Problem242ValidAnagram {


    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        List<Character> store = new ArrayList<Character>();

        for(char c: s.toCharArray()) {
            store.add(c);
        }

        for(char c : t.toCharArray()) {
            int index = store.indexOf(c);
            if(index == -1) return false;
            store.remove(index);
        }

        return true;
    }

    /*
        Slower solution

       if(s.length() != t.length()) return false;

        char[] sarr= s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return String.valueOf(sarr).equals(String.valueOf(tarr));

     */

    
    public static void main(String[] args) {
        
    }
}

