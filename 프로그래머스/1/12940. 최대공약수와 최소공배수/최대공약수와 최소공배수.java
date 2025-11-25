class Solution {
    public int[] solution(int n, int m) {
 
        int min = 0;
        int max = 0;
        
        if(m < n){
            int temp = m;
            m = n;
            n = temp;
        }
        
        for(int i = n;  i > 0; i--){
            if(n % i == 0 && m % i == 0){
                max = i;
                break;
            }
        }
        min = (n * m) / max;
        
        
        int[] answer = {max, min};
        
        return answer;
    }
}