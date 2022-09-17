package Solutions.Problem1265PrintImmutableLinkedListInReverse.gopi;

import java.util.Stack;

import Solutions.Problem1265PrintImmutableLinkedListInReverse.ImmutableListNode;

public class Problem1265PrintImmutableLinkedListInReverse {

    public void printLinkedListInReverse(ImmutableListNode head) {
        
        ImmutableListNode temp = head;
        
        Stack<ImmutableListNode> store = new Stack<ImmutableListNode>();
        
        while(temp != null) {
            
            store.push(temp);
            
            temp = temp.getNext();
        }
        
        // if(temp != store.peek()) {
        //     store.push(temp);
        // }
        
        while(store.size() > 0) {
            // ImmutableListNode hold = store.pop();
            // hold.printValue();
            store.pop().printValue();
        }
        
    }

    public static void main(String[] args) {
        
    }
    
}
