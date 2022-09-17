package Solutions.Problem234PalindromeLinkedList.gopi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem234PalindromeLinkedList {
    
    public boolean isPalindrome(ListNode head) {
        List<Integer> store = new ArrayList<Integer>();
        Stack<Integer> stackStore = new Stack<Integer>();
        ListNode temp = head;
        while(temp != null) {
            store.add(temp.val);
            stackStore.push(temp.val);
            temp = temp.next;
        }
        
        for(Integer each: store) {

            if(each != stackStore.pop()) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        
    }
}
