package Solutions.Problem844BackspaceStringCompare;

import java.util.Stack;

public class Problem844BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        
        return Problem844BackspaceStringCompare.findString(s).equals(Problem844BackspaceStringCompare.findString(t));
    }

    public static String findString(String stringToBreak){
        Stack<Character> store = new Stack<Character>();
        
        for(char c: stringToBreak.toCharArray()) {
            if(c == '#') {
                if(store.size() > 0){
                    store.pop(); 
                }
            }
            else {
                store.push(c);
            }
        }
        return String.valueOf(store);
    }

    public static void main(String[] args) {
        
        Problem844BackspaceStringCompare obj = new Problem844BackspaceStringCompare();

        boolean result = obj.backspaceCompare("ab#c", "ad#c");
        System.out.println(result);
    }
    
}
