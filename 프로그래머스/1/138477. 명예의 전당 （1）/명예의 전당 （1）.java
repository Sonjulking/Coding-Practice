import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> hallOfFame = new ArrayList<>();
        
        
        for(int i = 0; i < score.length; i++){
            hallOfFame.add(score[i]);
            
            for(int j = 0; j < hallOfFame.size() - 1; j ++){
                for (int l = 0; l < hallOfFame.size() - 1 - j; l ++){
                    if(hallOfFame.get(l) < hallOfFame.get(l + 1)){
                        int temp = hallOfFame.get(l);
                        hallOfFame.set(l, hallOfFame.get(l + 1));
                        hallOfFame.set(l + 1, temp);
                    }
                }
            }
            if(hallOfFame.size() > k){
                hallOfFame.remove(hallOfFame.size() - 1);
            }
            answer[i] = hallOfFame.get(hallOfFame.size() - 1);
            
        }
        
        
        return answer;
    }
}