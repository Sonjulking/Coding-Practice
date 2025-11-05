import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Map<Integer, Boolean> numberMap = new HashMap<>();
        
        for(int num : numbers){
            numberMap.put(num, true);
        }
        
        for(int i = 0; i <= 9; i++){
            if(!numberMap.containsKey(i)){
                answer += i;
            }
        }
        
        
        return answer;
    }
}