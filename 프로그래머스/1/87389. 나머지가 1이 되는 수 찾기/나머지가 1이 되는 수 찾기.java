import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer>  arrayList = new ArrayList<>();
        for(int i = 1; i < n; i ++){
            if(n % i == 1){
                arrayList.add(i);
            }
        }
        
        answer = arrayList.get(0);
        return answer;
    }
}