class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        long x = (long) sqrt;
        if(x  * x == n){
            return (x + 1) * (x + 1);
        } else{
            answer = -1;  
        }
        
        
        return answer;
    }
}