class Solution {
    public int solution(int n, int m, int[] section) {        
        int answer = 0;
        int maxCovered = 0;
        
        for(int i = 0; i < section.length; i++){
            int currentSection = section[i];
            
            if(currentSection > maxCovered) {
                answer ++;
                maxCovered = currentSection + m - 1;
            }
        }
        
        
        
        return answer;
    }
}