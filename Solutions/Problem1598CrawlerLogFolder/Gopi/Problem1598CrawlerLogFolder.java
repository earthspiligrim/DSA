package Solutions.Problem1598CrawlerLogFolder.Gopi;

public class Problem1598CrawlerLogFolder {
    
    public int minOperations(String[] logs) {
        
        int result = 0;
        
        for(int i=0; i< logs.length; i++) {
            
            switch(logs[i]) {
                case "./" :
                    result += 0;
                    break;
                case "../" :
                    if(result > 0)
                    result -= 1;
                    break;
                default:
                    result += 1;
            }
        }
        
        return result>0 ? result: 0;
    }

    public static void main(String[] args) {
        /*
         * 
         * Samle outputs:
         * ["d1/","d2/","../","d21/","./"]
         * ["./","wz4/","../","mj2/","../","../","ik0/","il7/"]
         */
    }
}
