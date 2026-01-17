import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int[] reversedB = new int[B.length];
        
        for(int i = 0; i < B.length; i ++ ){
            reversedB[i] = B[B.length - i - 1];
        }
        
        for(int i = 0; i < A.length; i ++) {
            answer += A[i] * reversedB[i];
        }

        return answer;
    }
}