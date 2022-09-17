package Solutions.Problem1762BuildingsWithanOceanView.gopi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem1762BuildingsWithAnOceanView {
    
    public int[] findBuildings(int[] heights) {
        // Stack<Integer> store = new Stack<>();

        // for(int eachHeight: heights) {
        //     store.push(eachHeight);
        // }
        
        List<Integer> store = new ArrayList();

        for(int i= heights.length-1; i>=0; i--) {
            if(i == heights.length-1) store.add(i);
            
        }
        

        return new int[]{};
    }

    public static void main(String[] args) {
        
    }
}
