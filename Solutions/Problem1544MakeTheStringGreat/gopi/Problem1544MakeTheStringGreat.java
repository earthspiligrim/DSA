package Solutions.Problem1544MakeTheStringGreat.gopi;

import java.util.Stack;

public class Problem1544MakeTheStringGreat {

    public String makeGood(String s) {
        if(s.isEmpty()) return s;
        Stack<Character> store = new Stack();
        
        //store.add(s.charAt(0));
        for(int i=0; i<=s.length()-2; i++) {
            if((Math.abs(s.charAt(i) - s.charAt(i+1))) != 32) {
                store.push(s.charAt(i));
            } else {
                i++;
            }
            // if((i>0) && (Math.abs(s.charAt(i) - s.charAt(i+1)) == 32)) {
  
            //         // store.pop();
            //         // i++;

            // } else {
            //     store.push(s.charAt(i));
            // }
        }

        if(Math.abs(s.charAt(s.length()-1 - s.charAt(s.length()-2))) != 32) {
            store.push(s.charAt(s.length()-1));
        }
        StringBuilder sb = new StringBuilder();
        while(store.size() > 0) {
            sb.insert(0,store.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Problem1544MakeTheStringGreat obj = new Problem1544MakeTheStringGreat();
        String res = obj.makeGood("leEeetcode");

        System.out.println(res);
    }
}
