class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        long longX = x;
        long xCopy = x;
        long sum = 0;
    
        while (longX > 0){
            sum =  sum + longX % 10;
            longX /= 10;
        }

        if(xCopy % sum  == 0) {
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
}