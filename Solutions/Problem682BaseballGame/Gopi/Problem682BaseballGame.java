package Solutions.Problem682BaseballGame.Gopi;

import java.util.Stack;

public class Problem682BaseballGame {

    public int calPoints(String[] ops) {
        Stack<Integer> store = new Stack<Integer>();
            
        try {
                for(int i=0; i< ops.length; i++) {
                    if(ops[i].equals("C")){
                        store.pop();
                    } else if(ops[i].equals("D")){
                        store.push(2*store.peek());
                    } else if(ops[i].equals("+")) {
                        // Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
                        int[] temp = new int[3];
                        temp[1] = store.pop();
                        temp[0] = store.pop();
                        temp[2] = temp[1] + temp[0];

                        for(int hold : temp) {
                            store.push(hold);
                        }
                    } else {
                        store.push(Integer.parseInt(ops[i]));
                    }
                    
                }
            } catch(NumberFormatException ex) {

            }

            int result = 0;

            while(store.size() != 0){
                result += store.pop();
            }

        return result;
    }

    public static void main(String[] args) {
        String[] ops = new String[]{"5","-2","4","C","D","9","+","+"};

        Problem682BaseballGame obj = new Problem682BaseballGame();

        int result = obj.calPoints(ops);

        System.out.println(result);
    }
}
