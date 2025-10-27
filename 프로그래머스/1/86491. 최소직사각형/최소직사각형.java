import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        
        int maxWidth = 0;
        int maxHeight = 0;
        for(int[] row : sizes){
            Arrays.sort(row);
        }
        
        for(int i = 0; i < sizes.length; i ++) {
            if(sizes[i][0] > maxWidth){
                maxWidth = sizes[i][0];
            }
            if(sizes[i][1] > maxHeight){
                maxHeight = sizes[i][1];
            }
        }
        

        
        
        int answer = maxWidth * maxHeight;
        return answer;
        
    }
}