package Solutions.Problem1047RemoveAllAdjacentDuplicatesInString.gopi;

import java.util.Stack;

public class Problem1047RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        
        Stack<Character> store = new Stack<Character>();
        
        for(Character c: s.toCharArray()) {
            if(store.isEmpty()){
                store.push(c);
            }
            else if(store.peek() != c) {
                store.push(c);
            } else {
                store.pop();
            }
            
        }

        StringBuilder str = new StringBuilder();
        while(!store.empty()){
            
            str.insert(0, store.pop());
        }
        return str.toString();
        /*
         * Runtime: 153 ms, faster than 27.16% of Java online submissions for Remove All Adjacent Duplicates In String.
Memory Usage: 56.3 MB, less than 31.43% of Java online submissions for Remove All Adjacent Duplicates In String.
         */
    }

    public static void main(String[] args) {
        Problem1047RemoveAllAdjacentDuplicatesInString obj = new Problem1047RemoveAllAdjacentDuplicatesInString();
        System.out.println(obj.removeDuplicates("abbaca"));
    }
}
