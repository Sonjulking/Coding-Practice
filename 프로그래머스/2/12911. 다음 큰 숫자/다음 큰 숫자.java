class Solution {
    public int solution(int n) {
        int smallCount = 0;
    
        String smallBinary = "";
        int copyN = n;
        
        while(copyN > 0){
            if (copyN % 2 == 1) {
                smallCount++;
            }

            copyN /= 2;
        }
            

        
        while(true){
            n++;
            int cpyN = n;
            int largeCount = 0;
            String largeBinary = ""; 
            while (cpyN > 0){
                if (cpyN % 2 == 1) {
                    largeCount++;
                }

                cpyN /= 2;
                
            }

            
            if(smallCount == largeCount){
                break;
            }
        }
        
        return n;
    }
}
